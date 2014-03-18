package org.appfuse.tutorial.webapp.rest;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.appfuse.tutorial.model.MyUser;
import org.appfuse.tutorial.model.Person;
import org.appfuse.tutorial.service.PersonManager;
import org.appfuse.tutorial.webapp.rest.service.MyUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;


@Path("/myuser")
@Repository("userRestService")
public class UserRestService {

    private final MyUserService userService;
    private final PersonManager personManager;

    @Autowired
    public UserRestService(MyUserService userService, PersonManager personManager) {
        this.userService = userService;
        this.personManager = personManager;
    }



    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<MyUser> getAllUsersInJSON() {
        return userService.getAllUsers();
    }

    
    @GET
    @Path("numberOfUsers")
    @Produces(MediaType.APPLICATION_JSON)
    public int getNumberOfUsers() {
        return userService.getNumberOfUsers();
    }
    
    @GET
    @Path("people")
    @Produces(MediaType.APPLICATION_JSON)
    public List<Person> getPeople() {
        return personManager.getPeople();
    }
    
    @GET
    @Path("people/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Person getPeopleById(@PathParam("id") long id) {
        return personManager.get(id);
    }
    
    
    @GET
    @Path("{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public MyUser getUserById(@PathParam("id") int id) {
        return userService.getById(id);
    }

    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public MyUser create(MyUser user) {
        return userService.createNewUser(user);
    }

    @PUT
    @Path("{id}")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public MyUser update(MyUser user) {
        return userService.update(user);
    }

    @DELETE
    @Path("{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public void remove(@PathParam("id") int id) {
        userService.remove(id);
    }
}
