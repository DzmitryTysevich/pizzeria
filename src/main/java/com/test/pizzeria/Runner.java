package com.test.pizzeria;

public class Runner {
    private static final PizzeriaHandler pizzeriaHandler = new PizzeriaHandler();

    public static void run() {
        pizzeriaHandler.handle();
    }
}