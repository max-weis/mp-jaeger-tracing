# tracing-demo

Demo project to show MicroProfile Opentracing with Openlibety and Jaeger

## Build

Run `mvn package` to build the application and container image.

Run `docker-compose up` to run the application and Jaeger

## Tracing

Navigate to `http://localhost:9088/tracing-demo/data/hello` to send a request

Under `http://locahost:16686` you  can view the Jaeger UI. Select _tracing-demo_ from the Service picker and press find traces

