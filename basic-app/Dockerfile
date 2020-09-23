FROM tomcat:8.5.50-jdk8-openjdk

WORKDIR /usr/local/bin

COPY ./build/libs/basic-app-0.0.1-SNAPSHOT.jar .

EXPOSE 8080

CMD ["java","-jar","basic-app-0.0.1-SNAPSHOT.jar"]

