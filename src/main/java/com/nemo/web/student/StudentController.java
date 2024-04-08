/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.nemo.web.student;

import java.util.List;

import com.nemo.web.user.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

/**
 *
 * @author Admin
 */
@RestController
public class StudentController {

    @Autowired
    private StudentService studentService;

    @GetMapping("/admin-thongke")
    public ModelAndView getAdminThongke() {
        ModelAndView modelAndView = new ModelAndView("admin-thongke/admin-thongke");
        List<Student> students = studentService.getAll();
        modelAndView.addObject("students", students);
        return modelAndView;
    }

    @GetMapping("/students")
    public List<Student> getAllStudent(){
        return studentService.getAll();
    }

    @PostMapping("/students/save")  
    public Student createStudent(@RequestBody Student model) {
        return studentService.save(model);
    }

    @PutMapping(value = "/students/{id}")  
    public Student updateStudent(@RequestBody Student model, @PathVariable("id") Integer id) {
        model.setId(id);
        return studentService.save(model);
    }

    @DeleteMapping(value = "/students/delete")
    public void deleteStudent(@RequestBody long[] ids) {
        studentService.delete(ids);
    }

}
