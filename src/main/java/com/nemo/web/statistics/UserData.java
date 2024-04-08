package com.nemo.web.statistics;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class UserData {

 @Id
 @GeneratedValue(strategy = GenerationType.IDENTITY)
 private Long id;

 private String username;
 private Double completionRatio;
 private Double averageScore;

 // getters and setters
}