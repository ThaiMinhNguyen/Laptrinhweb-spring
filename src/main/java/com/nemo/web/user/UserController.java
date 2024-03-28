/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.nemo.web.user;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Nemo
 */
@RestController
public class UserController {
    
    @Autowired
    private UserService userService;
    
    @GetMapping("/users")
    public List<User> getAllUser(){
        return userService.getAll();
    }
    
    @PostMapping("/users")
    public User createUser(@RequestBody User model) {
        return userService.save(model);
    }

    @PutMapping(value = "/users/{id}")
    public User updateUser(@RequestBody User model, @PathVariable("id") Integer id) {
        model.setId(id);
        return userService.save(model);
    }
    
    @DeleteMapping(value = "/users")
    public void deleteUser(@RequestBody long[] ids) {
        userService.delete(ids);
    }
}
