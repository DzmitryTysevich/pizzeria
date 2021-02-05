package com.test.pizzeria;

import com.test.pizzeria.account.Account;
import com.test.pizzeria.cart.Cart;
import com.test.pizzeria.client.Client;
import com.test.pizzeria.client.ClientOrder;
import com.test.pizzeria.courier.Courier;
import com.test.pizzeria.courier.Couriers;
import com.test.pizzeria.pay.Card;
import com.test.pizzeria.product.Drink;
import com.test.pizzeria.product.Pizza;
import com.test.pizzeria.product.Product;
import com.test.pizzeria.product.Products;

import static com.test.pizzeria.type.TypeDrink.*;
import static com.test.pizzeria.type.TypeSize.*;
import static com.test.pizzeria.type.TypeTransport.*;

public class PizzeriaHandler {
    private final Account account;
    private final Product farmPizza;
    private final Product bavarianPizza;
    private final Product colaDrink;
    private final Product pepsiDrink;
    private final Products products;
    private final Cart cart;
    private final ClientOrder clientOrder;
    private final Client client;
    private final Courier courier;
    private final Couriers couriers;

    public PizzeriaHandler() {
        account = new Account();
        farmPizza = new Pizza(ThirtySix, 22.89, "Mozzarella cheese", "Garlic sauce", "Ham", "cucumbers");
        bavarianPizza = new Pizza(ThirtySix, 22.89, "Bavarian sausages", "Mozzarella cheese", "Barbecue sauce", "Parmesan");
        colaDrink = new Drink(CocaCola, 1.5, 1);
        pepsiDrink = new Drink(Pepsi, 1.0, 1.1);
        products = new Products(farmPizza, bavarianPizza, colaDrink, pepsiDrink);
        cart = new Cart(products);
        clientOrder = new ClientOrder(cart, true);
        client = new Client(clientOrder, account.getUser(), new Card("BelarusBank", 430011223344L, "22/10", 500));
        courier = new Courier("Sasha", CAR, clientOrder);
        couriers = new Couriers(courier);
    }

    public void handle() {
        account.logUp("Bob", "123", 7554466);
        if (account.logIn()) {
            clientOrder.getAddress().setCity("Brest");
            clientOrder.getAddress().setStreet("Gogolya");
            clientOrder.getAddress().setNumHouse(10);
            clientOrder.getAddress().setNumApartment(10);
            System.out.println(client);
            System.out.println(courier);
        }
    }
}