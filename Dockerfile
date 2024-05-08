FROM openjdk:17
WORKDIR /app
COPY $[JAR-FILE] app.jar
EXPOSE 8084
CMD [ "java","-jar","JenkinsSample1-0.0.1-SNAPSHOT.jar"]
