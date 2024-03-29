/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.nemo.web.user;

import org.springframework.data.jpa.repository.JpaRepository;;

/**
 *
 * @author Nemo
 */
public interface UserRepository extends JpaRepository<User, Long> {
    User findByUserNameAndPasswordAndRole(String username, String password, Integer role);
}
