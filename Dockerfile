FROM openjdk:8-jre-alpine

COPY target/tracing-demo.jar /opt/tracing-demo.jar

EXPOSE 9080

ENTRYPOINT exec java -Djava.net.preferIPv4Stack=true -Djava.net.preferIPv4Addresses=true -jar /opt/tracing-demo.jar
