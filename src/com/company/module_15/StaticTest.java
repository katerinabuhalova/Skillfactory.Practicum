package com.company.module_15;

import java.util.ArrayList;

import java.util.List;

public class StaticTest {
    public static List<Double> list = new ArrayList<>();


    public void fillList() {
        for (int i = 0; i < 100; i++) {
            list.add(Math.random());
        }
        System.out.println("Size of the list is: " + list.size() );
    }
}
