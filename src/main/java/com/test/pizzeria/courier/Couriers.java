package com.test.pizzeria.courier;

import java.util.Arrays;
import java.util.List;

public class Couriers {
    private List<Courier> courierList;

    public Couriers(Courier... courierList) {
        this.courierList = Arrays.asList(courierList);
    }

    public List<Courier> getCourierList() {
        return courierList;
    }

    public void setCourierList(List<Courier> courierList) {
        this.courierList = courierList;
    }

    @Override
    public String toString() {
        return "Couriers{" + courierList + '}';
    }
}