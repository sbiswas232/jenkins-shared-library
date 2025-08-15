def call(){
  sh"""
  docker compose down && docker compose up -d --build
  docker images
  docker ps
  """
}
