package com.example.Assignment.controller;

import com.example.Assignment.dao.DAO_Product;
import com.example.Assignment.model.Product;
import com.example.Assignment.service.ProductService;
import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

import java.io.IOException;
import java.util.List;

@WebServlet(name = "HomePage", value = {"/home"})
public class HomePage extends HttpServlet {


    private ProductService productService = new ProductService();

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String uri = request.getRequestURI();

        if(uri.contains("/home")){
            request.getRequestDispatcher("HomePage.jsp").forward(request, response);
        }

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
