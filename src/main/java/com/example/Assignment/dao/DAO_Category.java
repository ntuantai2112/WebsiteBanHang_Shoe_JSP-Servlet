package com.example.Assignment.dao;

import com.example.Assignment.context.DBConnection;
import com.example.Assignment.model.Category;
import com.example.Assignment.model.Product;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class DAO_Category {

    public List<Category> getAllCategory( ){

        List<Category> listCategory = new ArrayList<>();
        String sqlQuery = "SELECT * FROM CATEGORY";

        try{
            Connection con  = DBConnection.openDbConnection();
            PreparedStatement ps = con.prepareStatement(sqlQuery);
            ResultSet rs = ps.executeQuery();
            while (rs.next()){
                listCategory.add(new Category(
                        rs.getInt(1),
                        rs.getString(2)
                ));
            }
        }catch (Exception e){
            e.printStackTrace();
        }
        return listCategory;
    }



    public void insert(Category category){

    }
    public void update(Integer id,Category category){

    }
    public void delete(Integer id){

    }
    public void findByName(String keyword){

    }


}
