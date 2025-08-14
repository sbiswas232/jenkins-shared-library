def call (String ImageName, String ImageTag, String DockerhubUser) {
  sh"""
  docker ps
  docker build -t "${DockerhubUser}"/"${ImageName}":"${ImageTag}" .
  docker run -d -p 80:80 "${DockerhubUser}"/"${ImageName}":"${ImageTag}"
  """
}
