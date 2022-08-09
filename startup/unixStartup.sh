echo Clearing Existing Containers
docker kill $(docker ps -q)
docker rm $(docker ps -a -q)
docker rmi docker-spring-boot-test

echo Starting Containers
docker-compose up -d