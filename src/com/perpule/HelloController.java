package com.perpule;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("/hello")
public class HelloController {
	
	 @GET
	 @Produces(MediaType.APPLICATION_JSON)
	 @Path("/customer/{customerId}")
	 public Response getHelloWorld(@PathParam("customerId") String customerId)
	{
		String Hello = "Jersey say :" + customerId;
		System.out.println("Hello");
		
	  //return new HelloWorldObject();

		return Response.status(200).entity(Hello).build();
	 }
}
