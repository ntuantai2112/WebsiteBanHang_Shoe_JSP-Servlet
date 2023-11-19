package com.example.Assignment.service;

import com.example.Assignment.dao.DAO_Product;
import com.example.Assignment.model.Product;

import java.util.ArrayList;
import java.util.List;

public class ProductService {

    private DAO_Product daoProduct = new DAO_Product();


    public List<Product> getAllProduct() {

        return daoProduct.getAllProduct();
    }

    public List<Product> getTop3Product() {
        return daoProduct.getTop3Product();
    }

    public List<Product> getNext3Product(Integer amount) {
        return daoProduct.getNext3Product(amount);
    }

    public List<Product> getProductByCategoryID(String id) {
        return daoProduct.getProductByCategoryID(id);
    }

    public Product getProductByID(String id) {
        return daoProduct.getProductByID(id);
    }

    public List<Product> searchProductByName(String keyword) {

        return daoProduct.searchProductByName(keyword);
    }

    public List<Product> getProductBySellID(int id) {
        return daoProduct.getProductBySellID(id);
    }

    public int getNumberPage() {
        return daoProduct.getNumberPage();
    }

    public List<Product> getPaging(int index) {
        return daoProduct.getPaging(index);
    }

    public void insert(Product product) {

    }

    public void update(Integer id, Product product) {

    }

    public void delete(Integer id) {
        daoProduct.delete(id);

    }

    public void findByName(String keyword) {

    }


}
