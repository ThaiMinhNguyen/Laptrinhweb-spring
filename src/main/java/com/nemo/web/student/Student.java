/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.nemo.web.student;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

/**
 *
 * @author Admin
 */
import java.util.Date;

@Entity
@Table(name = "students")
public class Student{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    
    @Column(length = 45, nullable = false, name = "username")
    private String name;
    
    @Column(nullable = false, length = 45)
    private String kythi;

    @Column
    private Date ngaythi;
    
    @Column
    private Integer diem;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getKythi() {
        return kythi;
    }

    public void setKythi(String kythi) {
        this.kythi = kythi;
    }

    public Date getNgaythi() {
        return ngaythi;
    }

    public void setNgaythi(Date ngaythi) {
        this.ngaythi = ngaythi;
    }

    public Integer getDiem() {
        return diem;
    }

    public void setDiem(Integer diem) {
        this.diem = diem;
    }
    
    
}
