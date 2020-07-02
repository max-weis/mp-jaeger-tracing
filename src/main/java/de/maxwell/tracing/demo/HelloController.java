package de.maxwell.tracing.demo;

import io.jaegertracing.Configuration;
import io.opentracing.Tracer;
import org.eclipse.microprofile.opentracing.Traced;

import javax.inject.Singleton;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.core.Response;

/**
 *
 */
@Path("/hello")
@Singleton
public class HelloController {

  Tracer tracer = Configuration
      .fromEnv()
      .getTracer();

  @GET
  @Traced(operationName = "HelloController.sayHello")
  public Response sayHello() {
    return Response
        .ok()
        .entity(tracer.toString())
        .build();
  }
}
