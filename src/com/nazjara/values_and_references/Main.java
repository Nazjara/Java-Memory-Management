package com.nazjara.values_and_references;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        int localValue = 5;
        calculate(localValue); // local variable is passed by value

        System.out.println(localValue); // 5

        List<String> list = new ArrayList<>();
        list.add("first");
        calculate(list); // reference on object is passed by value

        System.out.println(list.size()); // 2
    }

    private static void calculate(int localValue) {
        localValue = localValue * 100;
    }

    private static void calculate(List<String> list) {
        list.add("second");
    }


}
