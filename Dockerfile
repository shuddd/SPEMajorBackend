FROM openjdk:11
COPY target/springboot-backend-0.0.1-SNAPSHOT.jar springboot-backend-0.0.1-SNAPSHOT.jar
CMD ["java","-jar","springboot-backend-0.0.1-SNAPSHOT.jar"]
EXPOSE 8085
