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

import org.appfuse.model.User;
import org.appfuse.service.UserManager;
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
    private final UserManager userManager;

    @Autowired
    public UserRestService(MyUserService userService, PersonManager personManager, UserManager userManager) {
        this.userService = userService;
        this.personManager = personManager;
        this.userManager = userManager;
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
    @Path("manager")
    @Produces(MediaType.APPLICATION_JSON)
    public List<User> getUsers() {
        return userManager.getUsers();
    }
    
    @GET
    @Path("manager/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public User getUserById(@PathParam("id") long id) {
        return userManager.get(id);
    }
    
    @GET
    @Path("manager/name/{name}")
    @Produces(MediaType.APPLICATION_JSON)
    public User getUserByName(@PathParam("name") String name ) {
        return userManager.getUserByUsername(name);
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
