def call(String ImageName, String ImageTag, String DockerhubUsr, String DockerhubPass, String ContainerName){
  sh"""
  docker build -t "${ImageName}":"${ImageTag}" .
  docker tag "${ImageName}":"${ImageTag}" "${DockerhubUsr}"/"${ImageName}":"${ImageTag}"
  echo "${DockerhubPass}" | docker login -u "${DockerhubUsr}" --password-stdin docker.io
  docker push "${DockerhubUsr}"/"${ImageName}":"${ImageTag}"
  docker logout
  docker run -d -p --name "${ContainerName}" -p 80:80 "${ImageName}":"${ImageTag}"
  """
}
