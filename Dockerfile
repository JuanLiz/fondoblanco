FROM eclipse-temurin:19
COPY target/fondoblanco-0.0.2-SNAPSHOT.jar fondoblanco-0.0.2-SNAPSHOT.jar
EXPOSE 8080
ENTRYPOINT ["java","-jar","/fondoblanco-0.0.2-SNAPSHOT.jar"]
