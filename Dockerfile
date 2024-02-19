#FROM container-registry.oracle.com/graalvm/native-image
#FROM openjdk
#FROM maven

#WORKDIR /rinha
#COPY . .
#RUN mvn clean package

#CMD java -jar ./target/rinha-backend-0.0.1-SNAPSHOT.jar

FROM vegardit/graalvm-maven:latest-java21
WORKDIR /rinha
COPY . .
RUN mvn clean package

CMD java -jar ./target/rinha-backend-0.0.1-SNAPSHOT.jar