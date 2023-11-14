package com.example.Assignment.dao;

import com.example.Assignment.context.DBConnection;
import com.example.Assignment.model.Product;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class DAO_Product {



    public List<Product> getAllProduct( ){

        List<Product> listProduct = new ArrayList<>();
        String sqlQuery = "SELECT * FROM product";

        try{
            Connection con  = DBConnection.openDbConnection();
            PreparedStatement ps = con.prepareStatement(sqlQuery);
            ResultSet rs = ps.executeQuery();
            while (rs.next()){
                listProduct.add(new Product(
                        rs.getInt(1),
                        rs.getString(2),
                        rs.getString(3),
                        rs.getDouble(4),
                        rs.getString(5),
                        rs.getString(6)));
            }
        }catch (Exception e){
            e.printStackTrace();
        }
        return listProduct;
    }

    public List<Product> getTop3Product(){

        List<Product> listProduct = new ArrayList<>();
        String sqlQuery = "SELECT TOP 3 * FROM product";

        try{
            Connection con  = DBConnection.openDbConnection();
            PreparedStatement ps = con.prepareStatement(sqlQuery);
            ResultSet rs = ps.executeQuery();
            while (rs.next()){
                listProduct.add(new Product(
                        rs.getInt(1),
                        rs.getString(2),
                        rs.getString(3),
                        rs.getDouble(4),
                        rs.getString(5),
                        rs.getString(6)));
            }
        }catch (Exception e){
            e.printStackTrace();
        }
        return listProduct;
    }


    public List<Product> getNext3Product(Integer amount){

        List<Product> listProduct = new ArrayList<>();
        String sqlQuery = "SELECT * FROM product\n" +
                "ORDER BY id\n" +
                "OFFSET ? ROWS \n" +
                "FETCH NEXT 3 ROWS ONLY;  ";

        try{
            Connection con  = DBConnection.openDbConnection();
            PreparedStatement ps = con.prepareStatement(sqlQuery);
            ps.setInt(1,amount);
            ResultSet rs = ps.executeQuery();
            while (rs.next()){
                listProduct.add(new Product(
                        rs.getInt(1),
                        rs.getString(2),
                        rs.getString(3),
                        rs.getDouble(4),
                        rs.getString(5),
                        rs.getString(6)));
            }
        }catch (Exception e){
            e.printStackTrace();
        }
        return listProduct;
    }

    public List<Product> getProductByCategoryID(String id ) {

        List<Product> listProduct = new ArrayList<>();
        String sqlQuery = "SELECT * FROM product where cateID = ?";

        try{
            Connection con  = DBConnection.openDbConnection();
            PreparedStatement ps = con.prepareStatement(sqlQuery);
            ps.setString(1,id);
            ResultSet rs = ps.executeQuery();
            while (rs.next()){
                listProduct.add(new Product(
                        rs.getInt(1),
                        rs.getString(2),
                        rs.getString(3),
                        rs.getDouble(4),
                        rs.getString(5),
                        rs.getString(6)));
            }
        }catch (Exception e){
            e.printStackTrace();
        }
        return listProduct;
    }

    public Product getProductByID(String id ) {

        String sqlQuery = "SELECT * FROM product WHERE id = ?";

        try{
            Connection con  = DBConnection.openDbConnection();
            PreparedStatement ps = con.prepareStatement(sqlQuery);
            ps.setString(1,id);
            ResultSet rs = ps.executeQuery();
            while (rs.next()){
              return  new Product(
                        rs.getInt(1),
                        rs.getString(2),
                        rs.getString(3),
                        rs.getDouble(4),
                        rs.getString(5),
                        rs.getString(6));
            }
        }catch (Exception e){
            e.printStackTrace();
        }
        return null;
    }


    public List<Product> searchProductByName(String keyword ) {

        List<Product> listProduct = new ArrayList<>();
        String sqlQuery = "SELECT * FROM product WHERE [name] like ? ";

        try{
            Connection con  = DBConnection.openDbConnection();
            PreparedStatement ps = con.prepareStatement(sqlQuery);
            ps.setString(1, "%" + keyword + "%");
            ResultSet rs = ps.executeQuery();
            while (rs.next()){
                listProduct.add(new Product(
                        rs.getInt(1),
                        rs.getString(2),
                        rs.getString(3),
                        rs.getDouble(4),
                        rs.getString(5),
                        rs.getString(6)));
            }
        }catch (Exception e){
            e.printStackTrace();
        }
        return listProduct;
    }

    //Làm chức năng phân trang
    public int getNumberPage(){
        String sqlQuery = "select COUNT(*)  from product";
        try{
            Connection con  = DBConnection.openDbConnection();
            PreparedStatement ps = con.prepareStatement(sqlQuery);
            ResultSet rs = ps.executeQuery();
            while (rs.next()){
              int total = rs.getInt(1);
              int countPage = 0;
              countPage = total /6;
              if( total % 6 != 0){
                  countPage++;
              }

              return countPage;
            }
        }catch (Exception e){
            e.printStackTrace();
        }
        return 0;
    }


    public void insert(Product product){

    }
    public void update(Integer id,Product product){

    }
    public void delete(Integer id){

    }
    public void findByName(String keyword){

    }



}
