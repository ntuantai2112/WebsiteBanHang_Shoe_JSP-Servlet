package com.example.Assignment.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Product {

    private Integer id;
    private String name;
    private String image;
    private Double price;
    private String title;
    private String description;
    private Category category;
    private Sell sell;


    public Product(Integer id, String name, String image, Double price, String title, String description) {
        this.id = id;
        this.name = name;
        this.image = image;
        this.price = price;
        this.title = title;
        this.description = description;
    }
}
