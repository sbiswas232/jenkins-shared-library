def call(String GitUrl, String GitBranch, String CredentialId){
  git url: "${GitUrl}", branch: "${GitBranch}", credentialsId: "${CredentialId}"
}
