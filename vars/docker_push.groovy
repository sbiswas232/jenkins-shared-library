def call(String ImageName, String ImageTag, String DockerhubUsr, String DockerhubPass){
  sh"""
  docker build -t "${ImageName}":"${ImageTag}" .
  docker tag "${ImageName}":"${ImageTag}" "${DockerhubUsr}"/"${ImageName}":"${ImageTag}"
  echo "${DockerhubPass}" | docker login -u "${DockerhubUsr}" --password-stdin docker.io
  docker push "${DockerhubUsr}"/"${ImageName}":"${ImageTag}"
  docker logout
  """
}
