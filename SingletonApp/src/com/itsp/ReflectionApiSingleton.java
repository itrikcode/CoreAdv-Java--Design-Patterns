package com.itsp;

public class ReflectionApiSingleton {
    private static ReflectionApiSingleton INSTANCE = new ReflectionApiSingleton();

    public static ReflectionApiSingleton getInstance() {
        if (INSTANCE != null) {
            throw new RuntimeException("Object already created");
        }
        return INSTANCE;
    }

    private ReflectionApiSingleton() {
        System.out.println("0-arg constr");
    }

}
