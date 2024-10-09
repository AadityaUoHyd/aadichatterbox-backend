# Use a Maven base image with Java installed to build the Spring Boot app
FROM maven:3.8.4-openjdk-17 AS build

# Set the working directory
WORKDIR /app

# Copy the pom.xml file and install dependencies
COPY pom.xml ./
RUN mvn dependency:go-offline

# Copy the source code and build the application
COPY src ./src
RUN mvn clean package -DskipTests

# Use an official OpenJDK image for the final image
FROM openjdk:17-jdk-slim

# Set the working directory
WORKDIR /app

# Copy the built JAR file from the build stage
COPY --from=build /app/target/aadichatterbox-backend-0.0.1-SNAPSHOT.jar /app/aadichatterbox-backend.jar

# Expose the application port (change if needed)
EXPOSE 8080

# Run the application
ENTRYPOINT ["java", "-jar", "/app/aadichatterbox-backend.jar"]
