package com.test.pizzeria.account;

import com.test.pizzeria.user.User;

import java.util.Scanner;

public class Account {
    private final User user;

    public Account() {
        this.user = new User();
    }

    public User getUser() {
        return user;
    }

    private void register(String name, String pass, long phoneNumber) {
        logUp(name, pass, phoneNumber);
    }

    public boolean logIn() {
        boolean logInUser = false;
        Scanner in = new Scanner(System.in);
        System.out.print("Enter user name: ");
        String name = in.nextLine();
        System.out.print("Enter password: ");
        String pass = in.nextLine();
        if (name.equalsIgnoreCase(user.getName()) && pass.equals(user.getPassword())) {
            logInUser = true;
        }
        return logInUser;
    }

    public void logUp(String name, String pass, long phoneNumber) {
        user.setName(name);
        user.setPassword(pass);
        user.setNumber(phoneNumber);
    }
}