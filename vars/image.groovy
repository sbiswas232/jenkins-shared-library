def call (String ImageName, String ImageTag, String DockerhubUser) {
  sh'''
  docker build -t "${DockerhubUser}"/"${ImageName}":"${ImageTag}" .
  '''
}
