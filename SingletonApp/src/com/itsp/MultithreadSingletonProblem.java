package com.itsp;

public class MultithreadSingletonProblem implements Runnable {

    @Override
    public void run() {
        Singleton s = Singleton.getInstanceBlock();
        System.out.println(s.getMessage());
        System.out.println(s.hashCode());
    }

}