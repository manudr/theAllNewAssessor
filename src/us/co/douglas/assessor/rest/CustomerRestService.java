package us.co.douglas.assessor.rest;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.Response;

@Path("/customer")
public class CustomerRestService {

    @GET
    @Path("/books")
    public String getBooks() {
        return null;
    }

    @GET
    @Path("/book/{isbn}")
    public Response getBook(@PathParam("isbn") String id) {
        String result = "Restful Return! : " + id;
        return Response.status(200).entity(result).build();
    }


}