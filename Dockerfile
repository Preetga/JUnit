FROM maven:3-eclipse-temurin-8 AS build
WORKDIR /app
COPY pom.xml .
COPY src ./src
RUN mvn --batch-mode package

FROM eclipse-temurin:8-jre
WORKDIR /app
COPY --from=build /app/target/AreaOfCircle-0.0.1-SNAPSHOT.jar app.jar
CMD ["java", "-cp", "app.jar", "App"]
