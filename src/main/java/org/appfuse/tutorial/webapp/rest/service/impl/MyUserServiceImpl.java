package org.appfuse.tutorial.webapp.rest.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.appfuse.tutorial.model.MyUser;
import org.appfuse.tutorial.webapp.rest.service.MyUserService;
import org.springframework.stereotype.Repository;


@Repository("myUserService")
public class MyUserServiceImpl implements MyUserService {


    public MyUserServiceImpl() {
    }

    @Override
    public List getAllUsers() {
    	List<String> list = new ArrayList<>();
    	list.add("Daniel");
    	list.add("Pawel");
        return list;
    }

    @Override
    public MyUser getById(int id) {
        return new MyUser();
    }

    @Override
    public MyUser createNewUser(MyUser user) {
    	return new MyUser();
    }

    @Override
    public MyUser update(MyUser user) {
    	return new MyUser();
    }

    @Override
    public void remove(int id) {
        
    }

    @Override
    public int getNumberOfUsers() {
        return 10;
    }
}
