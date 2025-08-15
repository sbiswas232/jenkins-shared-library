def call(String ImageName, String ImageTag, String DockerhubUsr){
  sh"""
  docker build -t "${DockerhubUsr}"\"${ImageName}":"${ImageTag}" .
  """
}
