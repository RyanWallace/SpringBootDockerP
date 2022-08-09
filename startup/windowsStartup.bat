ECHO Clearing Existing Containers
FOR /f "tokens=*" %%i IN ('docker ps -aq') DO docker stop %%i
FOR /f "tokens=*" %%i IN ('docker ps -aq') DO docker rm %%i
docker rmi docker-spring-boot-test

ECHO Starting Containers
docker-compose up -d