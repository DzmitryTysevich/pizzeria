package com.test.pizzeria.client;

import com.test.pizzeria.address.Address;
import com.test.pizzeria.cart.Cart;

import java.util.Random;

public class ClientOrder {
    private Address address;
    private final long code;
    private boolean status;
    private final Cart cart;

    public ClientOrder(Cart cart, boolean status) {
        this.code = Math.abs(new Random().nextLong());
        this.cart = cart;
        this.status = status;
        this.address = new Address();
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public long getCode() {
        return code;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "ClientOrder{" +
                address +
                ", codeOrder=" + code +
                ", status=" + status + "}" +
                "\n" + cart;
    }
}