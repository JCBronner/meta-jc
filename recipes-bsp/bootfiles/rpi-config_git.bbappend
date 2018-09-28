do_deploy_append() {
	#ENABLE i2c by default
	echo "dtparam=i2c_arm=on" >> ${DEPLOYDIR}/bcm2835-bootfiles/config.txt
}
