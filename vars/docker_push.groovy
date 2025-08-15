def call(String ImageName, String ImageTag, String DockerhubUsr){
  sh"""
  docker build -t "${DockerhubUsr}"/"${ImageName}":"${ImageTag}" .
  #echo "${DOCKER_CREDENTIALS_PSW}" | docker login -u "${DockerhubUser}" --password-stdin docker.io
  #docker push "${DOCKER_CREDENTIALS_USR}"/"${ImageName}":"${ImageTag}"
  #docker logout
  """
}
