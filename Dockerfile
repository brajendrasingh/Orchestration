FROM java:8  
COPY . /var/www/java  
WORKDIR /var/www/java  
RUN javac Orchestration.jar  
CMD ["java", "-jar", "Orchestration"] 