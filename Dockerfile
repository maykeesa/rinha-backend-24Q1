#FROM container-registry.oracle.com/graalvm/native-image
#FROM maven

#WORKDIR /rinha
#COPY . .
#RUN mvn clean package

#CMD java -jar ./target/rinha-backend-0.0.1-SNAPSHOT.jar

FROM container-registry.oracle.com/graalvm/native-image
WORKDIR /rinha
COPY . .

FROM maven
RUN mvn clean package

CMD java -jar ./target/rinha-backend-0.0.1-SNAPSHOT.jar