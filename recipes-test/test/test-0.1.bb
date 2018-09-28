DESCRIPTION = "PI TEST HCSR04"
SECTION = "test"
SRC_URI = "file://test.c"
DEPENDS += "wiringpi"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/MIT;md5=0835ade698e0bcf8506ecda2f7b4f302"

S = "${WORKDIR}"

do_compile() {
	${CC} ${CFLAGS} ${LDFLAGS} test.c -lwiringPi -lpthread -o test
}

do_install() {
	install -d ${D}${bindir}
	install -m 0755 test ${D}${bindir}
}

