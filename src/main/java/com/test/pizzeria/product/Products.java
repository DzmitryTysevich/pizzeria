package com.test.pizzeria.product;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Products {
    private List<Product> productList;

    public Products(Product... product) {
        this.productList = Arrays.asList(product);
    }

    public List<Product> getProductList() {
        return productList;
    }

    public void setProductList(List<Product> productList) {
        this.productList = productList;
    }

    @Override
    public String toString() {
        return productList.stream().map(Product::toString).collect(Collectors.joining("\n"));
    }
}