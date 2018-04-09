FROM openjdk:9.0.4-jdk
ADD target/dockertime-0.0.1-SNAPSHOT.jar app.jar
EXPOSE 8085
ENTRYPOINT ["java", "-jar","app.jar"]
