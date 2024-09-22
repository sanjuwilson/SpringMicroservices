
FROM openjdk:17-jdk
WORKDIR /app
COPY target/Docker-0.0.1-SNAPSHOT.jar /app/Docker.jar
EXPOSE 8080
CMD ["java", "-jar", "/app/Docker.jar"]
