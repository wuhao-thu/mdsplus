#!/bin/bash
#
# platform/macosx/macosx_build.sh
#
# Invoked by mdsplus/deploy/build.sh for macosx platforms.
#
#

RED() {
    if [ "$1" = "yes" ]
    then
	echo -e "\033[31;47m"
    fi
}
GREEN() {
    if [ "$1" = "yes" ]
    then
	echo -e "\033[32;47m"
    fi
}
NORMAL() {
    if [ "$1" = "yes" ]
    then
	echo -e "\033[m"
    fi
}

set -e

if [ -r ${SRCDIR}/deploy/os/${OS}.env ]
then
    source ${SRCDIR}/deploy/os/${OS}.env
fi

MAKE=${MAKE:="env LANG=en_US.UTF-8 make"}

export PYTHONDONTWRITEBYTECODE=no
if [ "$TEST" = "yes" ]
then
    rm -Rf ${WORKSPACE}/test
    mkdir -p ${WORKSPACE}/test
    MDSPLUS_DIR=${WORKSPACE}/test/buildroot/usr/local/mdsplus
    mkdir -p ${MDSPLUS_DIR}
    pushd ${WORKSPACE}/test/
    ${SRCDIR}/configure \
	    --prefix=${MDSPLUS_DIR} \
	    --exec_prefix=${MDSPLUS_DIR} \
	    --with-java_target=6 \
	    --with-java_bootclasspath=${SRCDIR}/rt.jar \
            --enable-debug
    $MAKE
    $MAKE install
    if ( ! $MAKE -k tests 2>&1 )
    then
	RED $COLOR
	cat <<EOF >&2
======================================================

Failure doing normal tests.

======================================================
EOF
	NORMAL $COLOR
	exit
    fi
fi
    
if [ "$RELEASE" = "yes" ]
then
    mkdir -p ${RELEASEDIR}/${BRANCH}
    rm -Rf ${RELEASEDIR}/${BRANCH}/*
    ###
    ### Clean up workspace
    ###
    set +e
    rm -Rf ${WORKSPACE}/releasebld
    ###
    ### Build release version of MDSplus and then construct installer rpms
    ###
    set -e
    MDSPLUS_DIR=${WORKSPACE}/releasebld/buildroot/usr/local/mdsplus
    mkdir -p ${MDSPLUS_DIR}
    pushd ${WORKSPACE}/releasebld/
    ${SRCDIR}/configure \
	    --prefix=${MDSPLUS_DIR} \
	    --exec_prefix=${MDSPLUS_DIR} \
	    --with-java_target=6 \
	    --with-java_bootclasspath=${SRCDIR}/rt.jar
    $MAKE
    $MAKE install
    popd
    if [ "$BRANCH" == "stable" ]
    then
	BNAME=""
    else
	BNAME="-${BRANCH}"
    fi
    IFS='.' read -ra VERS <<< "${RELEASE_VERSION}"
    set +e
    sudo chown -R root:admin ${WORKSPACE}/releasebld/buildroot
    /Developer/usr/bin/packagemaker \
	--title "MDSplus%(pkgflavor)s" \
	--version "%(major)d.%(minor)d.%(release)d" \
	--scripts ${SRCDIR}/macosx/scripts \
	--install-to "/usr/local" \
	--target "10.5" \
	-r $(pwd)/build -v -i "MDSplus${BNAME}" \
	-o ${RELEASEDIR}/${BRANCH}/MDSplus${BNAME}-${VERS[0]}-${VERS[1]}-${VERS[2]}-osx.pkg
    status=$?
    sudo chown -R $(id -un):$(id -gn) $(pwd)/build
    if [ "$status" != "0" ]
    then
	>&2 echo "Error building installer"
    fi
fi

if [ "$PUBLISH" = "yes" ]
then
    set -e
    mkdir -p ${PUBLISHDIR}/${BRANCH}
    if [ "$BRANCH" == "stable" ]
    then
	BNAME=""
    else
	BNAME="-${BRANCH}"
    fi
    IFS='.' read -ra VERS <<< "${RELEASE_VERSION}"
    rsync -a ${RELEASEDIR}/${BRANCH}/MDSplus${BNAME}-${VERS[0]}-${VERS[1]}-${VERS[2]}-osx.pkg ${PUBLISHDIR}/${BRANCH}/
fi