package com.example.interviews.immutableClass;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ImmutableClass {
    private final String name;
    private final Integer id;
    private final Map<Integer, String> someMap;
    private final List<Integer> list;

    public ImmutableClass(String name, Integer id, Map<Integer, String> someMap, List<Integer> l1) {
        // Since Integer and String are Immutable by default, we don't need to create deep copies
        this.name = name;
        this.id = id;

        // Creating deep copy for List and Map since they can be mutable
        this.someMap = new HashMap<>(someMap);
        this.list = new ArrayList<>(l1);
    }

    public String getName() {
        return name;
    }

    public Integer getId() {
        return id;
    }

    public List<Integer> getList() {
        return list;
    }

    public Map<Integer, String> getSomeMap() {
        return someMap;
    }
}
