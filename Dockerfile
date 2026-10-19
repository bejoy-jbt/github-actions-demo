FROM openjdk:8
EXPOSE 8080
ADD target/github-actions-workflow.jar github-actions-workflow.jar
ENTRYPOINT ["java","-jar","/github-actions-workflow.jar"]