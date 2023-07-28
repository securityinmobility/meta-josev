SUMMARY = "A description of pyslac"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=86d3f3a95c324c9479bd8986968f4327"

SRC_URI = "git://github.com/SwitchEV/pyslac.git;branch=master;protocol=https"

S = "${WORKDIR}/git"
SRCREV = "e047321ae437ac6fd38a6fd619096ea3131e6da7"

inherit python_poetry_core
DEPENDS += "bash python3"
RDEPENDS:${PN} += "bash"

#do_install() {
#    install -d ${D}${PYTHON_SITEPACKAGES_DIR}
#    cp -r ${S}/* ${D}${PYTHON_SITEPACKAGES_DIR}/
#}
