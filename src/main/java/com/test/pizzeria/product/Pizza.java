package com.test.pizzeria.product;

import com.test.pizzeria.type.TypeSize;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class Pizza extends Product {
    private final TypeSize pizzaSize;
    private final List<String> ingredients;

    public Pizza(TypeSize size, double price, String... ingredients) {
        super(price);
        this.pizzaSize = size;
        this.ingredients = new ArrayList<>(Arrays.asList(ingredients));
    }

    public TypeSize getPizzaSize() {
        return pizzaSize;
    }

    public List<String> getIngredients() {
        return ingredients;
    }

    @Override
    public String toString() {
        return "Pizza{" +
                "price=" + super.getPrice() +
                ", pizzaSize=" + pizzaSize +
                ", ingredients=" + ingredients +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Pizza pizza = (Pizza) o;
        return pizzaSize == pizza.pizzaSize && Objects.equals(ingredients, pizza.ingredients);
    }

    @Override
    public int hashCode() {
        return Objects.hash(pizzaSize, ingredients);
    }
}