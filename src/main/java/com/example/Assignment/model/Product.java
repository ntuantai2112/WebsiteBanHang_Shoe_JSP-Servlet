package com.example.Assignment.model;

public class Product {

    private Integer id;
    private String name;
    private String image;
    private Double price;
    private String titel;
    private String description;
    private Category category;
    private Sell sell;

    public Product() {
    }

    public Product(Integer id, String name, String image, Double price, String titel, String description) {
        this.id = id;
        this.name = name;
        this.image = image;
        this.price = price;
        this.titel = titel;
        this.description = description;
    }

    public Product(Integer id, String name, String image, Double price, String titel, String description, Category category, Sell sell) {
        this.id = id;
        this.name = name;
        this.image = image;
        this.price = price;
        this.titel = titel;
        this.description = description;
        this.category = category;
        this.sell = sell;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public String getTitel() {
        return titel;
    }

    public void setTitel(String titel) {
        this.titel = titel;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public Sell getSell() {
        return sell;
    }

    public void setSell(Sell sell) {
        this.sell = sell;
    }
}
