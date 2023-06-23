package com.geekster.UMS.service;

import com.geekster.UMS.model.UserModel;
import com.geekster.UMS.repository.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    @Autowired
    UserRepo userrepo;

    public List<UserModel> getAllUsers() {
        return userrepo.getUsers();
    }

    public String addUser(UserModel user) {
        userrepo.add(user);
        return "User Added";
    }

    public UserModel getUserById(Integer userId) {

        for (UserModel u : userrepo.getUsers()) {
            if (u.getUserId() == userId) {
                return u;
            }
        }
        return null;

    }

    public String deleteUser(Integer userId) {
        for (UserModel u : userrepo.getUsers()) {
            if (u.getUserId().equals(userId)) {
                userrepo.delete(u);
            }
        }
        return "removed";
    }

    public String  updateUser(Integer userId) {

        for (UserModel u : userrepo.getUsers()) {
            if (u.getUserId().equals(userId)) {
                u.setUserName(u.getUserName());
                u.setUserAddress(u.getUserAddress());
                u.setUserPhoneNumber(u.getUserPhoneNumber());
                return "User updated successfully";
            }
        }
        return "User not found";
    }
}
