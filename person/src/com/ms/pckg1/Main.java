package com.ms.pckg1;

import javax.ws.rs.Path;

import org.json.JSONObject;
import org.springframework.stereotype.Service;

@Service
@Path("/main")
public class Main {
 
Person a[]=new Person[1];
a[0].id=10;
a[0].age=34;
a[0].name="hrllo";
a[0].salary=46;
@GET
@Path("/getUsers")
@Produces("application/json")
JSONObject obj=new JSONObject();

obj.put("Person",a[0]);
public Person
	
	

}
