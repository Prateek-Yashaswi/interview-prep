package com.example.interviews.immutableClass;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {

        Map<Integer, String> map = new HashMap<>();
        List<Integer> l1 = new ArrayList<>();

        l1.add(1);
        l1.add(2);
        map.put(1, "TEST");

        ImmutableClass immutableClass = new ImmutableClass("TEST", 1, map, l1);
        System.out.println(immutableClass.getId());
        System.out.println(immutableClass.getName());
        System.out.println(immutableClass.getSomeMap());
        System.out.println(immutableClass.getList());

        System.out.println("-----------------------------------THE RESULTS BELOW SHOULD NOT CHANGE SINCE WE HAVE IMPLEMENTED DEEP COPY-------------------------------------------------");
        map.put(2, "SOME DATA");
        l1.add(3);
        System.out.println(immutableClass.getSomeMap());
        System.out.println(immutableClass.getList());
    }
}
