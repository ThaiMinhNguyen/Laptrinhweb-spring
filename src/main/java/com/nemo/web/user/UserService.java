/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.nemo.web.user;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Nemo
 */
@Service
public class UserService implements IUserService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public User save(User user) {
        user = userRepository.save(user);
        return user;
    }

    @Override
    public void delete(long[] ids) {
        for(long id : ids){
            userRepository.deleteById(id);
        }
    }

    @Override
    public List<User> getAll() {
        return (List<User>) userRepository.findAll();
    }

    @Override
    public User findByUserNameAndPasswordAndRole(String username, String password, Integer role) {
       return userRepository.findByUserNameAndPasswordAndRole(username, password, role);   
    }
    
}
