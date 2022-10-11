FROM openjdk:11

EXPOSE 8080

ADD target/activity-service.jar activity-service.jar

ENTRYPOINT ["java", "-jar", "activity-service.jar"]