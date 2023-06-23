package com.example.krontest.models;

import java.util.Map;

public class DTOFactory {
    private String name;
    private Map<String, Integer> material;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Map<String, Integer> getMaterial() {
        return material;
    }

    public void setMaterial(Map<String, Integer> material) {
        this.material = material;
    }
}
