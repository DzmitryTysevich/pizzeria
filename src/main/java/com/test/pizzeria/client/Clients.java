package com.test.pizzeria.client;

import java.util.Arrays;
import java.util.List;

public class Clients {
    private List<Client> clientList;

    public Clients(Client... clientList) {
        this.clientList = Arrays.asList(clientList);
    }

    public List<Client> getClientList() {
        return clientList;
    }

    public void setClientList(List<Client> clientList) {
        this.clientList = clientList;
    }

    @Override
    public String toString() {
        return "Clients{" +
                "clientList=" + clientList +
                '}';
    }
}