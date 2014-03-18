package org.appfuse.tutorial.webapp.rest;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.core.Response;

import org.springframework.stereotype.Component;

@Component
@Path("/payment")
public class PaymentService {

	@GET
	@Path("/mkyong")
	public Response savePayment() {

		String result = "SomeTest";

		return Response.status(200).entity(result).build();

	}

}