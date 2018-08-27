HOMEPAGE = "https://github.com/pauldotknopf/Qml.Net"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${WORKDIR}/git/LICENSE;md5=83ba2569924e580d05f1e218b553de3c"

SRC_URI = "git://github.com/pauldotknopf/Qml.Net.git;protocol=http;branch=develop"
SRCREV = "${AUTOREV}"
PV = "git${SRCPV}"

S = "${WORKDIR}/git/src/native/QmlNet"

DEPENDS += "qtbase qtdeclarative qtquickcontrols2"

do_install_append() {
    install -d ${D}${libdir}
    mv ${D}/libQmlNet.so ${D}${libdir}
}

INSANE_SKIP_${PN}-dev += "dev-so dev-elf"

inherit qmake5
