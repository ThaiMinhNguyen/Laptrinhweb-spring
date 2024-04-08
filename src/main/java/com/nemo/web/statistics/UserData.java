package com.nemo.web.statistics;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "userdata")
public class UserData {

 @Id
 @GeneratedValue(strategy = GenerationType.IDENTITY)
 private Long id;

 @Column
 private String username;
 @Column
 private Double completionRatio;
 @Column
 private Double averageScore;

 
}