package com.ms;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;

public interface Allfunction {

	@GET
	@Path("/getByName/{name}/")
	@Produces("application/json")
	public String getByName(@PathParam("name") String name);
	
	@GET
	@Path("/fill/{id}/{name}/{age}/{salary}")
	@Produces("application/json")
	public String fill(@PathParam("name") String name,@PathParam("id") int id,@PathParam("age") int age,@PathParam("salary") int salary);
	
	@GET
	@Path("/getAll")
	@Produces("application/json")
	public String getAll();
	
}