#
# Build stage
#
FROM maven:3.6.0-jdk-11 AS build
COPY src /home/app/src
COPY pom.xml /home/app
RUN mvn -f /home/app/pom.xml clean package

#
# Package stage
#
FROM openjdk:11
COPY --from=build /home/app/target/activity-service.jar /usr/local/lib/activity-service.jar
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "/usr/local/lib/activity-service.jar"]
