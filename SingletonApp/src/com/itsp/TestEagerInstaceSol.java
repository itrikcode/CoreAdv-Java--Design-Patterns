package com.itsp;

public class TestEagerInstaceSol {
    public static void main(String[] args) {
        EagerSingleton es = EagerSingleton.getInnerInstance();
        EagerSingleton es1 = EagerSingleton.getInnerInstance();
        // EagerSingleton es2 = EagerSingleton.getInstance();
        // EagerSingleton es3 = EagerSingleton.getInstance();
        System.out.println(es.hashCode() + "==" + es1.hashCode());
        // System.out.println(es2.hashCode() + " ==" + es3.hashCode());
    }
}
