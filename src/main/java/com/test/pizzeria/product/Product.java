package com.test.pizzeria.product;

public abstract class Product {
    private final double price;

    public Product(double price) {
        this.price = price;
    }

    public double getPrice() {
        return price;
    }
}