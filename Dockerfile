FROM eclipse-temurin:17-jdk
ADD ./target/my-jobs.jar my-jobs.jar
EXPOSE 8080
ENTRYPOINT ["java","-jar","my-jobs.jar"]