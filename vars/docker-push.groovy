def call (String DockerhubUser, String DockerhubPass) {
  sh"""
  docker ps
  echo "${DockerhubPass}" | docker login -u "${DockerhubUser}" --password-stdin docker.io
  docker push sbiswas232/classwebsite2-app:v14aug25
  docker logout
  """
}
