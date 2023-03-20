### 🤷🏼‍♂️ PREREQUISITE DEV

- Java version 11 (at least)
- Maven
- Docker environment
- Docker compose

### 🐳 RUNNING THE APP DOCKER

```shell
mvn clean install -Dmaven.test.skip # install all deps for backend from parent pom file
docker-compose --env-file=.env build # build service with docker
docker-compose --env-file=.env up # deploy service to docker
```