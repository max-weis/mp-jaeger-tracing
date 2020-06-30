FROM open-liberty:kernel-java8-openj9

COPY --chown=1001:0 src/main/liberty/config /config/
COPY --chown=1001:0 target/tracing-demo.war /config/apps
