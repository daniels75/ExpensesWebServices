package org.appfuse.tutorial.webapp.rest.service;

import java.util.List;

import org.appfuse.tutorial.model.MyUser;


public interface MyUserService {

    List<MyUser> getAllUsers();

    MyUser getById(int id);

    MyUser createNewUser(MyUser user);

    MyUser update(MyUser user);

    void remove(int id);

    int getNumberOfUsers();
}
