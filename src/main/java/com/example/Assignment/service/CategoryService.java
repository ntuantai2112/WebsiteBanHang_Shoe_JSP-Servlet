package com.example.Assignment.service;

import com.example.Assignment.context.DBConnection;
import com.example.Assignment.dao.DAO_Category;
import com.example.Assignment.model.Category;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class CategoryService {

    private DAO_Category daoCategory = new DAO_Category();

    public List<Category> getAllCategory() {


        return daoCategory.getAllCategory();
    }

    public void insert(Category category) {

    }

    public void update(Integer id, Category category) {

    }

    public void delete(Integer id) {

    }

    public void findByName(String keyword) {

    }


}
