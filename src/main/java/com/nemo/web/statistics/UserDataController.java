package com.nemo.web.statistics;

//UserController.java
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController
public class UserDataController {

 @Autowired
 private UserDataRepository userRepository;

 @GetMapping("/statistics")
 public List<UserData> getUserStatistics() {
     return userRepository.findAll();
 }
}
