FROM openjdk:17-jdk-alpine3.14
ADD target/k8s_app.jar k8s_app.jar
EXPOSE 8080
ENTRYPOINT ["java","-jar","k8s_app.jar"]