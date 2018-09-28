SUMMARY = "Console only image"
inherit core-image
inherit image
IMAGE_INSTALL_append = " openssh"
IMAGE_INSTALL += "alsa-tools alsa-utils i2c-tools wiringpi test-0.1 python"
LICENSE = "GPLv2"
IMAGE_FSTYPES += "ext3 tar.gz"
INHERIT += "rm_work"
IMAGE_FEATURES += "package-management"
ENABLE_UART = "1"
