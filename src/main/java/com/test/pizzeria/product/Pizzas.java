package com.test.pizzeria.product;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Pizzas {
    private List<Pizza> pizzaList;

    public Pizzas(Pizza... pizzaList) {
        this.pizzaList = new ArrayList<>(Arrays.asList(pizzaList));
    }

    public List<Pizza> getPizzaList() {
        return pizzaList;
    }

    public void setPizzaList(List<Pizza> pizzaList) {
        this.pizzaList = pizzaList;
    }

    @Override
    public String toString() {
        return "Pizzas{" +
                "pizzaList=" + pizzaList +
                '}';
    }
}