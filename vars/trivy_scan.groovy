def call(String ImageName){
  sh"""
  trivy fs -f json -o ./fs-scan.json .
  trivy image -f table ./image-scan.txt "${ImageName}"
  sh"""
}
