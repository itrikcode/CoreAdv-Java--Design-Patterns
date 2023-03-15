package com.itsp;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class TestReflection {
    public static void main(String[] args) {
        ReflectionApiSingleton r1 = ReflectionApiSingleton.getInstance();
        ReflectionApiSingleton r2 = ReflectionApiSingleton.getInstance();
        ReflectionApiSingleton r3 = ReflectionApiSingleton.getInstance();
        ReflectionApiSingleton r4 = ReflectionApiSingleton.getInstance();
        System.out.println(r1.hashCode() + "---" + r2.hashCode());
        System.out.println(r3.hashCode() + "---" + r4.hashCode());
        //// PROBLEM
        // using reflection api we can break the role of singletone class
        // why becaouse we can access private contructor using reflection api
        // like setAccessible(true)
        /// SOLUTION

        // but one more check in side getInstance method linke object is already created

        try {
            Class c = r1.getClass();
            Constructor[] con = c.getDeclaredConstructors();
            con[0].setAccessible(true);
            ReflectionApiSingleton r5 = (ReflectionApiSingleton) con[0].newInstance();
            ReflectionApiSingleton r6 = (ReflectionApiSingleton) con[0].newInstance();
            System.out.println(r5.hashCode() + "====" + r6.hashCode());
        } catch (InstantiationException | IllegalAccessException | IllegalArgumentException
                | InvocationTargetException e) {

            e.printStackTrace();
        }
    }
}
