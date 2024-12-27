# Use the official OpenJDK 21 image as the base image
FROM openjdk:21-jdk

# Set the working directory inside the container
WORKDIR /app

# Copy the current directory contents into the container at /app
COPY . /app

# Compile the application
RUN ./gradlew build

# Run the application
CMD ["java", "-jar", "build/libs/your-app.jar"]