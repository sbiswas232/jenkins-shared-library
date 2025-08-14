def call (String ImageName, String ImageTag, String DockerhubUser, String DockerhubPass) {
  sh"""
  echo "${DockerhubPass}" | docker login -u "${DockerhubUser}" --password-stdin docker.io
  docker push "${DockerhubUser}"/"${ImageName}":"${ImageTag}"
  docker logout
  """
}
