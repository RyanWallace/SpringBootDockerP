FROM openjdk:17.0.2-jdk
MAINTAINER Maintainer

ARG JAR_FILE=/target/*.jar
COPY ${JAR_FILE} application.jar

ENTRYPOINT ["java", "-jar", "application.jar"]