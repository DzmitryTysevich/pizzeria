package com.test.pizzeria.cart;

import com.test.pizzeria.product.Product;
import com.test.pizzeria.product.Products;

public class Cart {
    private final Products products;
    private final double sumPrice;

    public Cart(Products products) {
        this.products = products;
        sumPrice = calculateSumPrice();
    }

    public Products getProducts() {
        return products;
    }

    public double getSumPrice() {
        return sumPrice;
    }

    private double calculateSumPrice() {
        return products.getProductList().stream()
                .mapToDouble(Product::getPrice)
                .sum();
    }

    @Override
    public String toString() {
        return "Cart\n________________________________________________________________________________________________________________________\n" +
                products + "\n________________________________________________________________________________________________________________________" +
                "\nsumPrice=" + sumPrice;
    }
}