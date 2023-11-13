package com.example.Assignment.service;

import com.example.Assignment.dao.DAO_Product;
import com.example.Assignment.model.Product;

import java.util.ArrayList;
import java.util.List;

public class ProductService {

    private DAO_Product daoProduct = new DAO_Product();


    public List<Product> getAllProduct( ){

        return daoProduct.getAllProduct();
    }

    public List<Product> getProductByCategoryID(String id ){
        return daoProduct.getProductByCategoryID(id);
    }

    public Product getProductByID(String id ){
        return  daoProduct.getProductByID(id);
    }

    public List<Product> searchProductByName(String keyword ){

        return  daoProduct.searchProductByName(keyword);
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
