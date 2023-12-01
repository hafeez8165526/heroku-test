FROM openjdk:8u131-jdk-alpine
EXPOSE 8081:8081
COPY ./target/test-0.0.1.jar test.jar 
ENTRYPOINT ["java","-jar","/test.jar"]