package com.itsp;

public class Singleton {

    private static Singleton INSTANCE;

    private Singleton() {
        System.out.println("0-arg constructor");
    }

    public static Singleton getInstance() {
        if (INSTANCE == null)
            INSTANCE = new Singleton();
        return INSTANCE;
    }

}
