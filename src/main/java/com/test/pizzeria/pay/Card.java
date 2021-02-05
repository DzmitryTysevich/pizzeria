package com.test.pizzeria.pay;

public class Card extends Payment {
    private String bankName;
    private long number;
    private String validity;

    public Card(String bankName, long number, String validity, int value) {
        super(value);
        this.bankName = bankName;
        this.number = number;
        this.validity = validity;
    }

    public String getValidity() {
        return validity;
    }

    public void setValidity(String validity) {
        this.validity = validity;
    }

    public String getBankName() {
        return bankName;
    }

    public void setBankName(String bankName) {
        this.bankName = bankName;
    }

    public long getNumber() {
        return number;
    }

    public void setNumber(long number) {
        this.number = number;
    }

    @Override
    public String toString() {
        return "Card{" +
                "bankName='" + bankName + '\'' +
                ", number=" + number +
                ", validity='" + validity + '\'' +
                ", value=" + super.getValue() +
                '}';
    }
}