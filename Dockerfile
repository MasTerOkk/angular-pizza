FROM openjdk:21-ea-17-slim-buster
WORKDIR /app
COPY ./target/pizza-0.0.1-SNAPSHOT.jar /app/application.jar
ENTRYPOINT ["java", "-jar", "application.jar"]