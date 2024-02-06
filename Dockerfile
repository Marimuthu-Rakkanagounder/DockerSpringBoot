# define base docker image
FROM openjdk:11
LABEL maintainer="DockerSpringBoot"
ADD target/DockerSpringBoot-0.0.1-SNAPSHOT.jar DockerSpringBoot.jar
ENTRYPOINT ["java", "-jar", "DockerSpringBoot.jar"]