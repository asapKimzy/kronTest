package com.example.krontest.models;

import java.util.Map;

public class DTOManuf {
    private String name;
   private Map<String,Integer> items;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Map<String, Integer> getItems() {
        return items;
    }

    public void setItems(Map<String, Integer> items) {
        this.items = items;
    }
}
