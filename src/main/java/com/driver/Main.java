package com.driver;

public class Main {

    public static void main(String[] args) {
        RWOnly obj = new RWOnly();

        // obj.name = "Ujjwal";

        //name has private access cannot be set
        // through class object

        obj.setName("Ujjwal");

        System.out.println(obj.getName());
    }
}