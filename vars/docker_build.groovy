// Define function
def call(String ProjectName, String ImageTag="latest", String DockerHubUser){
  sh "docker build -t ${DockerHubUser}/${ProjectName}:${ImageTag} ."
}
