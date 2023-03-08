package com.itsp;

public class EagerSingleton {
    private static EagerSingleton INSTANCE = new EagerSingleton();

    private EagerSingleton() {
        System.out.println("0-arg constr");
    }

    public static EagerSingleton getInstance() {
        return INSTANCE;
    }
}
