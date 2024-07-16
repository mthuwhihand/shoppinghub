FROM openjdk:17
ARG JAR_FILE=target/*.jar
COPY ${JAR_FILE} shoppinghub.jar
ENTRYPOINT ["java","-jar","/shoppinghub.jar"]
EXPOSE 80