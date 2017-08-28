FROM openjdk:jre-slim

RUN apt-get -y update && apt-get install -y vim procps

COPY build/libs/VIPDinner-1.0-SNAPSHOT.jar /irdeto-oss/VIPDinner.jar

WORKDIR irdeto-oss

ENTRYPOINT ["java"]
CMD ["-server", "-Xmx128M", "-jar", "VIPDinner.jar"]
