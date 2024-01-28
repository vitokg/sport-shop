package org.example;

import java.util.ArrayList;

public class Order {
    ArrayList<Product> products = new ArrayList<>();

    public void addProduct(Product product) {
        products.add(product);
    }

    public double getTotalPrice() {
        double totalPrice = 0;
        for (Product product : products) {
            totalPrice += product.price;
        }
        return totalPrice;
    }

    public void printOrderDetails() {
        System.out.println("Order details:");
        for (Product product : products) {
            System.out.println(product);
        }

        System.out.println("Total price: " + getTotalPrice());
    }
}
