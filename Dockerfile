# define base docker image
FROM openjdk:11
LABEL maintainer="madhudocker.net"
ADD target/madhuit-spring-boot-0.0.1-SNAPSHOT.jar madhuit-spring-boot.jar
ENTRYPOINT ["java", "-jar", "madhuit-spring-boot.jar"]

