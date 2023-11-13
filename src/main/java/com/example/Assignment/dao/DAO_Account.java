package com.example.Assignment.dao;

import com.example.Assignment.context.DBConnection;
import com.example.Assignment.model.Account;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class DAO_Account {




    public Account getAccount(String username, String password){
        String sqlQuery = "Select * From Account where [user] = ? and pass = ?";


        try {

            Connection con  = DBConnection.openDbConnection();
            PreparedStatement ps = con.prepareStatement(sqlQuery);
            ps.setString(1,username);
            ps.setString(2,password);
            ResultSet rs = ps.executeQuery();
            while (rs.next()){
                return  new Account(
                        rs.getInt(1),
                        rs.getString(2),
                        rs.getString(3),
                        rs.getInt(4),
                        rs.getInt(5)
                );
            }


        }catch (Exception ex){
            ex.printStackTrace();
        }

        return null;
    }

    public static void main(String[] args) {

        DAO_Account dao = new DAO_Account();
        System.out.println(dao.getAccount("adam","123456"));
    }



}
