# Use Maven image for building the Java project
FROM maven:3.8.1-jdk-11 as build
WORKDIR /app
COPY pom.xml .
RUN mvn dependency:go-offline
COPY src ./src
RUN mvn clean package

# Use Java image for running the application
FROM openjdk:11-jre
WORKDIR /app
COPY --from=build /app/target/task-manager-backend-1.0-SNAPSHOT.jar ./app.jar
CMD ["java", "-jar", "app.jar"]
