package com.geekster.UMS.controller;

import com.geekster.UMS.model.UserModel;
import com.geekster.UMS.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserController {
    @Autowired
    UserService userService;

    @GetMapping("/users")
    public List<UserModel> getAllUsers() {
        return userService.getAllUsers();
    }

    @PostMapping("/user")
    public String addUser(@RequestBody UserModel user) {
        return userService.addUser(user);
    }

    @GetMapping("user/{userId}")
    public UserModel getUserById(@PathVariable Integer userId) {
        return userService.getUserById(userId);
    }

    @DeleteMapping("users/{userId}")
    public String deleteUser(@PathVariable Integer userId) {
        return userService.deleteUser(userId);


    }

    @PutMapping("/user/{userId}")
    public String updateUser(@PathVariable Integer userId, @RequestBody UserModel updatedUser) {
    return userService.updateUser(userId, updatedUser);
}





}















