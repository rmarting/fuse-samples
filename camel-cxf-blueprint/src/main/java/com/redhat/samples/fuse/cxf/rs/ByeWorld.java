package com.redhat.samples.fuse.cxf.rs;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;

@Path("/ByeWorld")
public class ByeWorld {

	@GET
	@Path("/{name}")
	@Produces("text/html")
	public String sayBye(@PathParam("name") String name) {
		return "Bye " + name + "!";
	}
	
}
