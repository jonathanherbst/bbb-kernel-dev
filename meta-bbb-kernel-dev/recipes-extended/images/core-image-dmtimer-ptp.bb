require recipes-extended/images/core-image-kernel-dev.bb

CORE_IMAGE_EXTRA_INSTALL += "\
    dmtimer-ptp \
    linuxptp \
    pps-tools \
    chrony \
    chronyc \
    i2c-tools \
    nodejs \
    gdb \
    lxc \
"