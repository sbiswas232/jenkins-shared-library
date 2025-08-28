def call(String OdcName){
  dependencyCheck additionalArguments: '--scan ./', odcInstallation: "${OdcName}"
  dependencyCheckPublisher pattern: '**/odc-report.xml'
}
