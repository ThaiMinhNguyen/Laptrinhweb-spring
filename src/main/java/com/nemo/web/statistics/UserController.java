package com.nemo.web.statistics;

//UserController.java
import com.nemo.web.statistics.UserData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;
import com.nemo.web.statistics.UserDataRepository;

@RestController
@RequestMapping("/users")
public class UserController {

 @Autowired
 private UserDataRepository userRepository;

 @GetMapping("/statistics")
 public List<UserData> getUserStatistics() {
     return userRepository.findAll();
 }
}
