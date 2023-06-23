package com.example.krontest.models;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class Detail {
    @Id

    private Long id;
    private String name;
    private String applicabillity;
    private String workShop;
    private String material;

    @ManyToOne
    private Build builds;

    public Build getBuilds() {
        return builds;
    }

    public void setBuilds(Build builds) {
        this.builds = builds;
    }

    public void setId(Long id) {
        this.id = id;
    }


    public Long getId() {
        return id;
    }

    public Detail(Long id, String name, String applicabillity, String workShop, String material) {
        this.id=id;
        this.name = name;
        this.applicabillity = applicabillity;
        this.workShop = workShop;
        this.material = material;
    }

    public Detail() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getApplicabillity() {
        return applicabillity;
    }

    public void setApplicabillity(String applicabillity) {
        this.applicabillity = applicabillity;
    }

    public String getWorkShop() {
        return workShop;
    }

    public void setWorkShop(String workShop) {
        this.workShop = workShop;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    @Override
    public String toString() {
        return "Detail{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", applicabillity='" + applicabillity + '\'' +
                ", workShop=" + workShop +
                ", material='" + material + '\'' +
                '}';
    }
}
