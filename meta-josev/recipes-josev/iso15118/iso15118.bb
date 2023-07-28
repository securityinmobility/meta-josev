SUMMARY = "A description of iso15118"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=86d3f3a95c324c9479bd8986968f4327"

SRC_URI = "git://github.com/SwitchEV/iso15118.git;branch=master;protocol=https"

S = "${WORKDIR}/git"
SRCREV = "93d648f3a461a5a10f17c49d81a53a1c9214b115"

inherit python_poetry_core
DEPENDS += "bash python3"
RDEPENDS:${PN} += "bash"


#do_install() {
#    install -d ${D}${PYTHON_SITEPACKAGES_DIR}
#    cp -r ${S}/* ${D}${PYTHON_SITEPACKAGES_DIR}/
#}



