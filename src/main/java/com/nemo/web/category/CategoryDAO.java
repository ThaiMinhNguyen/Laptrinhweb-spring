/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.nemo.web.category;

import dal.DBContext;
import java.util.ArrayList;
import java.util.List;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
/**
 *
 * @author 84866
 */
public class CategoryDAO extends DBContext{
    public List<Category> getAll(){
        List<Category> list = new ArrayList<>();
        String sql ="select * from Categories";
        try{
            PreparedStatement st = connection.prepareStatement(sql);
            ResultSet rs = st.executeQuery();
            while(rs.next()){
                Category c = new Category(rs.getInt("id"),
                                            rs.getString("name"),
                                            rs.getString("describe"));
                list.add(c);
            }
        }
        catch(SQLException e){
            System.out.println(e);
        }
        return list;
    }
    public static void main(String[] args) {
        CategoryDAO c=new CategoryDAO();
        List<Category> list=c.getAll();
        System.out.println(list.get(0).getName());
 }
}
