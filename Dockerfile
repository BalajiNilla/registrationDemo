FROM openjdk:8
ADD target/registration-0.0.1-SNAPSHOT.jar registration-0.0.1-SNAPSHOT.jar
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "registration-0.0.1-SNAPSHOT.jar"]