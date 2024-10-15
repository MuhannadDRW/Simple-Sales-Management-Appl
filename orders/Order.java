package com.ecommerce.orders;
import com.ecommerce.*;
import java.util.ArrayList;

public class Order {
    // id variable is the id
    private int id;
    // id counter used to make the id increases each time there is more customer had added
    private static int idCounter = 0;
    private Customer customer;
    private double totalAmount;


    public Order(Customer customer){
        idCounter++;
        this.customer = customer;
        this.totalAmount = calcTotal(customer.getShoppingCart());
        this.id = idCounter;
    }

    public int getId() {
        return id;
    }

    public Customer getCustomer() {
        return customer;
    }

    public double getTotalAmount() {
        return totalAmount;
    }

    // to calculate the total amount that the customer should pay
    private double calcTotal(ArrayList<Product> products){
        double totalAmount = 0;
        for(Product i : products){
            totalAmount = totalAmount + i.getPrice();
        }
        return totalAmount;
    }

}
