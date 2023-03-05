FROM openjdk:17-alpine

WORKDIR /app

COPY build/libs/*.jar buy-any.jar

ENTRYPOINT ["java", "-jar", "buy-any.jar"]
