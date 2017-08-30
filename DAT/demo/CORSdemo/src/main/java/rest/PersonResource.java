/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rest;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.UriInfo;
import javax.ws.rs.Produces;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PUT;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

/**
 * REST Web Service
 *
 * @author Thomas Hartmann - tha@cphbusiness.dk
 */
@Path("person")
public class PersonResource {
Gson gson = new GsonBuilder().setPrettyPrinting().create();
    @Context
    private UriInfo context;

    /**
     * Creates a new instance of PersonResource
     */
    public PersonResource() {
    }

    /**
     * Retrieves representation of an instance of rest.PersonResource
     * @return an instance of java.lang.String
     */
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public String getJson() {
        //TODO return proper representation object
        JsonObject job = new JsonObject();
        job.addProperty("name", "Henrik Poulsen");
        job.addProperty("age", 25);
        JsonArray phones = new JsonArray();
        JsonObject phone1 = new JsonObject(); phone1.addProperty("mobile", "45566778");
        JsonObject phone2 = new JsonObject(); phone2.addProperty("home", "45333333");
        phones.add(phone1);phones.add(phone2);
        job.add("phone numbers", phones);
        return gson.toJson(job);
    }
    
    /**
     * Retrieves representation of an instance of rest.PersonResource
     * @return an instance of java.lang.String
     */
    @GET
    @Path("/allowed")
    @Produces(MediaType.APPLICATION_JSON)
    public Response getJsonCORSAllowed() {
        //TODO return proper representation object
        JsonObject job = new JsonObject();
        job.addProperty("name", "Henriette Pallesen");
        job.addProperty("age", 52);
        JsonArray phones = new JsonArray();
        JsonObject phone1 = new JsonObject(); phone1.addProperty("mobile", "45121212");
        JsonObject phone2 = new JsonObject(); phone2.addProperty("home", "45300300");
        phones.add(phone1);phones.add(phone2);
        job.add("phone numbers", phones);
        gson.toJson(job);
        //This will only work with simple request - see http://cxf.apache.org/docs/jax-rs-cors.html
        //return Response.ok().entity(gson.toJson(job)).header("Access-Control-Allow-Origin", "*").build();
        return Response.ok().entity(gson.toJson(job)).header("Access-Control-Allow-Origin", "http://localhost:8383").build();
    }

    /**
     * PUT method for updating or creating an instance of PersonResource
     * @param content representation for the resource
     */
    @PUT
    @Consumes(MediaType.APPLICATION_JSON)
    public void putJson(String content) {
    }
}
