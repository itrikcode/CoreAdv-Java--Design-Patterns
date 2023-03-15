package com.itsp;

public class CloneSingtonTest {
    public static void main(String[] args) {
        CloneSingletone cs = CloneSingletone.getInstace();
        try {
            CloneSingletone cs1 = (CloneSingletone) cs.clone();
            System.out.println(cs.hashCode() + "==" + cs1.hashCode());
            System.out.println("cs == cs2?" + (cs == cs1));
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
