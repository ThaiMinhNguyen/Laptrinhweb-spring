/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.nemo.web.user;

import java.util.List;

/**
 *
 * @author Admin
 */

public interface IUserService {
    List<User> getAll();
    User save(User user);
    void delete(long[] ids);
    User findByUserNameAndPasswordAndRole(String username, String password, Integer role);
}
