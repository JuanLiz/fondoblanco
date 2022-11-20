FROM eclipse-temurin:19-alpine
COPY target/fondoblanco-0.0.1-SNAPSHOT.jar fondoblanco-0.0.1-SNAPSHOT.jar
EXPOSE 8080
ENTRYPOINT ["java","-jar","/fondoblanco-0.0.1-SNAPSHOT.jar"]
