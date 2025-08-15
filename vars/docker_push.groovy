def call(String ImageName, String ImageTag, String DOCKER_CREDENTIALS_USR, String DOCKER_CREDENTIALS_PSW){
  sh"""
  docker build -t "${DOCKER_CREDENTIALS_USR}"/"${ImageName}":"${ImageTag}" .
  echo "${DOCKER_CREDENTIALS_PSW}" | docker login -u "${DockerhubUser}" --password-stdin docker.io
  docker push "${DOCKER_CREDENTIALS_USR}"/"${ImageName}":"${ImageTag}"
  docker logout
  """
}
