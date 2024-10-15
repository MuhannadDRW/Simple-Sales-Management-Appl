package com.ecommerce;


public class Product {
    // id variable is the id
    private int id;
    // id counter used to make the id increases each time there is more products had added
    private static int idCounter = 0;
    private String name;
    private double price;


    public Product(String name, double price) {
        idCounter++;
        setName(name);
        setPrice(price);
        this.id = idCounter;
    }


    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        if(price > 0) {
            this.price = price;
        }
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public int getId() {
        return id;
    }
}
