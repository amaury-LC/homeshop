package com.alc.HomeShop.homeshop;


import com.alc.HomeShop.homeshop.Bill;

public class Product {

    private String name;
    private String description;
    private Double price;

    public Product(String name, String description, Double price) {
        this.name = name;
        this.description = description;
        this.price = price;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }



    /**
     * Display a full description of the product
     */

    public void look(){


    }

    /**
     * Add the product to a Bill
     * @param bill the concerned Bill
     * @param quantity the quantity to add
     */

    public void buy(Bill bill, Integer quantity){




    }
}