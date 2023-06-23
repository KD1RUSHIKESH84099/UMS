package com.geekster.UMS.repository;

import com.geekster.UMS.model.UserModel;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
@Repository
public class UserRepo {

    private List<UserModel> users;


    public UserRepo(){
        users = new ArrayList<>();
    }

    public List<UserModel> getUsers() {
        return users;
    }
    public void add(UserModel user){
        users.add(user);
    }
    public void delete(UserModel user){
        users.remove(user);

    }







}
