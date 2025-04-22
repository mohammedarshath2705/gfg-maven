# Use OpenJDK 11 as base image
FROM openjdk:11.0

# Add metadata (optional but recommended)
LABEL maintainer="mohammedarshath"

# Copy the JAR file from target folder to the container
COPY target/gfg-calculator.jar gfg-calculator.jar

# Set the entry point to run the JAR
ENTRYPOINT ["java", "-jar", "gfg-calculator.jar"]
