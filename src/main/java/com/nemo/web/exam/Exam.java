package com.nemo.web.exam;

import jakarta.persistence.*;

@Entity
@Table(name = "exams")
public class Exam {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String title;

	public void setId(Long id2) {
		// TODO Auto-generated method stub
		
	}

    // Getters and setters
}

