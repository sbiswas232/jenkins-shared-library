def call(String ImageName, String ImageTag, String DockerhubUser, String DockerhubPass){
  sh"""
  docker build -t "\${DockerhubPass}"/"${ImageName}":"${ImageTag}" .
  echo "\${DockerhubPass}" | docker login -u "\${DockerhubUser}" --password-stdin docker.io
  docker push "\${DockerhubPass}"/"${ImageName}":"${ImageTag}"
  docker logout
  """
}
