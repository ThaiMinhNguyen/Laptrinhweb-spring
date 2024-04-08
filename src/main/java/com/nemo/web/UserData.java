package com.nemo.web;


import jakarta.persistence.*;

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

