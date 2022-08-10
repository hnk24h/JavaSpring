# syntax=docker/dockerfile:1
FROM openjdk:oraclelinux8

WORKDIR /app
# copy from locahost to container
COPY .mvn/ .mvn
COPY mvnw pom.xml ./
#Run this inside the image
RUN ./mvnw dependency:go-offline
COPY src ./src
#run inside container
CMD ["./mvnw", "spring-boot:run"]