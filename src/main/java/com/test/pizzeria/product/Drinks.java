package com.test.pizzeria.product;

import java.util.Arrays;
import java.util.List;

public class Drinks {
    private List<Drink> drinkList;

    public Drinks(Drink... drink) {
        this.drinkList = Arrays.asList(drink);
    }

    public List<Drink> getDrinkList() {
        return drinkList;
    }

    public void setDrinkList(List<Drink> drinkList) {
        this.drinkList = drinkList;
    }

    @Override
    public String toString() {
        return "Drinks{" +
                "drinkList=" + drinkList +
                '}';
    }
}