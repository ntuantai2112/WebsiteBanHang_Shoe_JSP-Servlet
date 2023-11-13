package com.example.Assignment.controller;

import com.example.Assignment.model.Category;
import com.example.Assignment.model.Product;
import com.example.Assignment.service.CategoryService;
import com.example.Assignment.service.ProductService;
import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

import java.io.IOException;
import java.util.List;

@WebServlet(name = "ShopController", value ={ "/ShopController","/shop","/category","/detail"})
public class ShopController extends HttpServlet {

    private ProductService productService = new ProductService();
    private CategoryService categoryService = new CategoryService();

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String uri = request.getRequestURI();



      if(uri.contains("/shop")) {
            List<Product> listProduct = productService.getAllProduct();
            List<Category> listCategory = categoryService.getAllCategory();
            request.setAttribute("products", listProduct);
            request.setAttribute("categorys", listCategory);
            request.getRequestDispatcher("/views/shop.jsp").forward(request, response);
        }

        else if(uri.contains("/category")){

          String categoryID = request.getParameter("cid");


          List<Product> listProduct = productService.getProductByCategoryID(categoryID);
          List<Category> listCategory = categoryService.getAllCategory();
          request.setAttribute("products", listProduct);
          request.setAttribute("categorys", listCategory);
          request.setAttribute("tag", categoryID);
          request.getRequestDispatcher("/views/shop.jsp").forward(request, response);
      }

      else if(uri.contains("/detail")){
          String productID = request.getParameter("pid");
          Product productDetail = productService.getProductByID(productID);
          request.setAttribute("detail",productDetail);
          request.getRequestDispatcher("/views/ShowDetailProduct.jsp").forward(request, response);
      }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
