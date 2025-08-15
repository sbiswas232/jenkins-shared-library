def call(String ImageName, String ImageTag, String DockerhubUsr, String DockerhubPass, String ContainerName, String PortNum){
  sh"""
  docker build -t "${ImageName}":"${ImageTag}" .
  docker tag "${ImageName}":"${ImageTag}" "${DockerhubUsr}"/"${ImageName}":"${ImageTag}"
  echo "${DockerhubPass}" | docker login -u "${DockerhubUsr}" --password-stdin docker.io
  docker push "${DockerhubUsr}"/"${ImageName}":"${ImageTag}"
  docker logout
  docker run -d --name "${ContainerName}" -p "${PortNum}" "${ImageName}":"${ImageTag}"
  """
}
