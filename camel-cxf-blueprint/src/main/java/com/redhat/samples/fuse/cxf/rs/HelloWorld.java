package com.redhat.samples.fuse.cxf.rs;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;

@Path("/HelloWorld")
public class HelloWorld {

	@GET
	@Path("/{name}")
	@Produces("text/html")
	public String sayHi(@PathParam("name") String name) {
		return "Hi " + name + "!";
	}
	
}
