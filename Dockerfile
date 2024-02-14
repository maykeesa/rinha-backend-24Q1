#FROM container-registry.oracle.com/graalvm/native-image:21
FROM openjdk:22
#FROM ubuntu

COPY ./target/rinha-backend-0.0.1-SNAPSHOT.jar rinha.jar
#RUN native-image -jar rinha.jar

CMD java -jar rinha.jar
