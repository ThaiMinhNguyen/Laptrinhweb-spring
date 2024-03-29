/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.nemo.web.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

/**
 *
 * @author Admin
 */
@Controller
public class AdminLogin {
    
    @Autowired
    private UserService userService;

    @PostMapping("/admin-login")
    public ModelAndView login(@RequestParam("username") String username, @RequestParam("password") String password) {
        ModelAndView modelAndView = new ModelAndView();
        if (userService.findByUserNameAndPasswordAndRole(username, password, 0) != null) {
            // Nếu đăng nhập thành công, chuyển hướng đến trang dashboard
            modelAndView.setViewName("redirect:./pages/admin-dashboard/admin-dashboard.html");
        } else {
            // Nếu đăng nhập không thành công, hiển thị thông báo và chuyển hướng về trang đăng nhập
            modelAndView.addObject("message", "Tên đăng nhập hoặc mật khẩu không đúng.");
            modelAndView.setViewName("redirect:/admin-login.html");
        }
        return modelAndView;
    }
    
    @PostMapping("/index")
    public ModelAndView loginWithStudentAccount() {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("redirect:/");
        return modelAndView;
    }
    
}
