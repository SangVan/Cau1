# FROM adoptopenjdk/openjdk11:alpine
#
# WORKDIR /app
#
# COPY target/onthicuoikitk-0.0.1-SNAPSHOT.jar .
#
# CMD ["java", "-jar", "/app/onthicuoikitk-0.0.1-SNAPSHOT.jar"]
FROM adoptopenjdk/openjdk11:alpine

WORKDIR /
COPY . .

CMD mvn spring-boot:run