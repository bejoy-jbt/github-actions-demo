FROM eclipse-temurin:21-jdk
EXPOSE 8080
ADD target/*.jar github-actions-workflow.jar
ENTRYPOINT ["java","-jar","/github-actions-workflow.jar"]