DESCRIPTION = "Kernel module for ti am335x processors for implementing qot timing"
LICENSE = "GPLv2"
LIC_FILES_CHKSUM = "file://LICENSE;md5=b234ee4d69f5fce4486a80fdaf4a4263"
  
inherit module
  
SRCREV = "5b78e4f949cea99c5a4d66831716fc5b2f4bc6a5"
SRC_URI = "git://github.com/jonathanherbst/cpsw-ppsout.git;protocol=https;branch=dmtimer_pps"
  
PV = "git_${SRCREV}"
  
S = "${WORKDIR}/git"