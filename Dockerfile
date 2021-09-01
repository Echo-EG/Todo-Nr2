
FROM openjdk:11

RUN mkdir /app

COPY . /app

ENTRYPOINT  ["java", "-jar", "app/build/libs/Todo-Nr2-0.0.1-SNAPSHOT.jar"]