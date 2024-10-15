package com.ecommerce;

import java.util.ArrayList;

public class Customer {
    // id counter used to make the id increases each time there is more customer had added
    private static int idCounter = 0;
    // id variable is the id
    private int id;
    private String name;
    private ArrayList<Product> shoppingCart;


    public Customer(String name){

        idCounter++;
        setName(name);
        shoppingCart = new ArrayList<>();
        id = idCounter;
    }


    public int getId() {
        return id;
    }



    public String getName() {
        return name;
    }

    public void setName(String name) {
        if(isAlpha(name)) {
            this.name = name;
        }
    }


    public ArrayList<Product> getShoppingCart() {
        return shoppingCart;
    }

    // to add the product to the customer's shopping cart
    public void addToShoppingCart(Product product) {
        this.shoppingCart.add(product);
    }


    public static boolean isAlpha(String n){
        for(int i = 0; i<n.length(); i++){
            if (!Character.isLetter(n.charAt(i))){
                return false;
            }
        }
        return true;
    }
}
