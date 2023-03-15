package com.itsp;

public class CloneSingletone extends CommonUtils {
    private static class InnerClass {
        private static volatile CloneSingletone INSTANCE = new CloneSingletone();
    }

    private CloneSingletone() {
        System.out.println("0-arg constructor");
    }

    public static CloneSingletone getInstace() {
        return InnerClass.INSTANCE;
    }

    public Object clone() throws CloneNotSupportedException {
        // throw new CloneNotSupportedException("Cloning not allowed for single
        // CloneSingleton class");
        return InnerClass.INSTANCE;
    }

    public void getMessage() {
        System.out.println("Clone singletone class");
    }

}
