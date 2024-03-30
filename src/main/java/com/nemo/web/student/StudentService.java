/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.nemo.web.student;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Admin
 */
@Service
public class StudentService {

    @Autowired
    private StudentRepository studentRepository;  // Changed from UserRepository

  
    public Student save(Student student) {  // Changed from User
        student = studentRepository.save(student);
        return student;
    }

 
    public void delete(long[] ids) {
        for (long id : ids) {
            studentRepository.deleteById(id);
        }
    }

 
    public List<Student> getAll() {  // Changed from List<User>
        return studentRepository.findAll();  // No need for casting
    }

}
