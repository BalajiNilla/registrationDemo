FROM openjdk:17
VOLUME /tmp
COPY target/registration-0.0.1-SNAPSHOT.jar registration.jar
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "registration.jar"]