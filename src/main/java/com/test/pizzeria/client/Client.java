package com.test.pizzeria.client;

import com.test.pizzeria.user.User;
import com.test.pizzeria.pay.Payment;

public class Client {
    private ClientOrder clientOrder;
    private User user;
    private Payment payment;

    public Client(ClientOrder clientOrder, User user, Payment payment) {
        this.clientOrder = clientOrder;
        this.user = user;
        this.payment = payment;
    }

    public ClientOrder getClientOrder() {
        return clientOrder;
    }

    public void setClientOrder(ClientOrder clientOrder) {
        this.clientOrder = clientOrder;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Payment getPayment() {
        return payment;
    }

    public void setPayment(Payment payment) {
        this.payment = payment;
    }

    @Override
    public String toString() {
        return "Client{" + "\n" + user +
                ", \npayment=" + payment +
                "\n" + clientOrder +
                '}';
    }
}