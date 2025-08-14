def call (String ImageName, String ImageTag, String DockerhubUser) {
  sh"""
  docker ps
  docker build -t "${DockerhubUser}"/"${ImageName}":"${ImageTag}" .
  """
}
