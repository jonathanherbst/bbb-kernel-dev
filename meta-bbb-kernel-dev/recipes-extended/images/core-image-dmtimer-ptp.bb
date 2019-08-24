require recipes-extended/images/core-image-kernel-dev.bb

CORE_IMAGE_EXTRA_INSTALL += "\
    dmtimer-ptp \
    linuxptp \
    pps-tools \
    chrony \
    i2c-tools \
    python-smbus \
"