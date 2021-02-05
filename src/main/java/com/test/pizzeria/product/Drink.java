package com.test.pizzeria.product;

import com.test.pizzeria.type.TypeDrink;

import java.util.Objects;

public class Drink extends Product {
    private final TypeDrink type;
    private double volume;

    public Drink(TypeDrink type, double volume, double price) {
        super(price);
        this.type = type;
        this.volume = volume;
    }

    public TypeDrink getType() {
        return type;
    }

    public double getVolume() {
        return volume;
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }

    @Override
    public String toString() {
        return "Drink{" +
                "price=" + super.getPrice() +
                ", type=" + type +
                ", volume=" + volume +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Drink drink = (Drink) o;
        return Double.compare(drink.volume, volume) == 0 && type == drink.type;
    }

    @Override
    public int hashCode() {
        return Objects.hash(type, volume);
    }
}