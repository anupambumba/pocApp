FROM maven:3-jdk-11-openj9 AS builder

WORKDIR /app
COPY . /app

RUN mvn package

FROM adoptopenjdk:11-jre-openj9

WORKDIR /app
COPY --from=builder /app/target/helloworld-0.0.1-SNAPSHOT.jar /app/helloworld-0.0.1-SNAPSHOT.jar

#EXPOSE 8071:8091
ENTRYPOINT ["java", "-jar", "/app/helloworld-0.0.1-SNAPSHOT.jar"]


#docker build --tag helloworld .
#docker images
#docker run -p 8070:8090 94dcf43fd66d
#docker ps
#docker exec -it 4e1d7d9487e9 /bin/bash
