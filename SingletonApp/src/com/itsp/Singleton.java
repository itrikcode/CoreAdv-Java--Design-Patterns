package com.itsp;

public class Singleton {

    /*
     * 
     * we have 3 solution to solve the multithread problem to create as a singleton
     * class.
     * 1. we can create object at the of class loding (eager instantation)
     * 2. we can use static factory method as snycronized method(but good solution)
     * 2. we can take snycronized bloks inside static factory method
     */
    private static Singleton INSTANCE;

    private Singleton() {
        System.out.println("0-arg constructor");
    }

    // 2. we can use static factory method as snycronized method(but good solution)
    /*
     * use synchronized key word to make class as singleton but not good solution
     * for this
     * public synchronized static Singleton getInstance() {
     * if (INSTANCE == null) {
     * INSTANCE = new Singleton();
     * }
     * 
     * return INSTANCE;
     * }
     */

    public static Singleton getInstance() {
        if (INSTANCE == null) {
            System.out.println("if");
            INSTANCE = new Singleton();
        }
        return INSTANCE;
    }

    // 3. we can take snycronized bloks inside static factory method
    public static Singleton getInstanceBlock() {
        if (INSTANCE == null) {
            synchronized (Singleton.class) {
                if (INSTANCE == null) {
                    System.out.println("if");
                    INSTANCE = new Singleton();
                }
            }
        }

        return INSTANCE;
    }

    // bussines login
    public String getMessage() {
        return "Hello Singleton Object";
    }

}
