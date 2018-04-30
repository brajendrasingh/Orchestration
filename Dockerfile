FROM java:8  
MAINTAINER brajendra
COPY ../target/*.jar .  
WORKDIR / 
ADD orchestration.jar orchestration.jar  
EXPOSE 8080
CMD ["java","-jar","orchestration.jar"]