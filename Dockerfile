FROM eclipse-temurin:17-jre
WORKDIR /app

# Copy the JAR file (assuming it's built locally)
COPY target/*.jar app.jar

# Create a non-root user
RUN groupadd -r appuser && useradd -r -g appuser appuser
USER appuser

EXPOSE 8080
ENTRYPOINT ["java", "-jar", "app.jar"] 