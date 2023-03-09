package com.itsp;

public class EagerSingleton {
    private static EagerSingleton INSTANCE = new EagerSingleton();

    // solve eager instantation for singleton object using inner class as private
    // class
    private static class InnerInstance {
        private static volatile EagerSingleton INNERINSTACE = new EagerSingleton();
    }

    public static EagerSingleton getInnerInstance() {
        return InnerInstance.INNERINSTACE;
    }

    // private EagerSingleton() {
    // System.out.println("0-arg constr");
    // }

    public static EagerSingleton getInstance() {
        return INSTANCE;
    }
}
