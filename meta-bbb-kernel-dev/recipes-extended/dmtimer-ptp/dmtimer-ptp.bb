DESCRIPTION = "Kernel module for ti am335x processors for implementing qot timing"
LICENSE = "GPLv2"
LIC_FILES_CHKSUM = "file://LICENSE;md5=b234ee4d69f5fce4486a80fdaf4a4263"
  
inherit module
  
SRCREV = "1b1b206e177901bd4b32bc4ad2e41cacc01df0d8"
SRC_URI = "git://github.com/jonathanherbst/cpsw-ppsout.git;protocol=https"
  
PV = "git_${SRCREV}"
  
S = "${WORKDIR}/git"