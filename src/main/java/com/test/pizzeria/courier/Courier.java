package com.test.pizzeria.courier;

import com.test.pizzeria.client.ClientOrder;
import com.test.pizzeria.type.TypeTransport;

public class Courier {
    private String name;
    private TypeTransport transport;
    private final ClientOrder clientOrder;

    public Courier(String name, TypeTransport transport, ClientOrder clientOrder) {
        this.clientOrder = clientOrder;
        this.transport = transport;
        this.name = name;
    }

    public ClientOrder getClientOrder() {
        return clientOrder;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public TypeTransport getTransport() {
        return transport;
    }

    public void setTransport(TypeTransport transport) {
        this.transport = transport;
    }

    @Override
    public String toString() {
        return "Courier{" +
                "name='" + name + '\'' +
                ", transport=" + transport +
                ", clientOrder=" + clientOrder +
                '}';
    }
}