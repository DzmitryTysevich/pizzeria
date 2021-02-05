package com.test.pizzeria.pay;

public class Cash extends Payment {
    private String moneyName;

    public Cash(String moneyName, int value) {
        super(value);
        this.moneyName = moneyName;
    }

    public String getMoneyName() {
        return moneyName;
    }

    public void setMoneyName(String moneyName) {
        this.moneyName = moneyName;
    }

    @Override
    public String toString() {
        return "Cash{" +
                "moneyName='" + moneyName + '\'' +
                ", value=" + super.getValue() +
                '}';
    }
}