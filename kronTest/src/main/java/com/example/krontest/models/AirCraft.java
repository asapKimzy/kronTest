package com.example.krontest.models;

import jakarta.persistence.*;

@Entity
public class AirCraft {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    @OneToOne
    private Build build;

    public AirCraft(String name, Build build) {

        this.name = name;
        this.build = build;
    }

    public AirCraft() {
    }

    public void setId(Long id) {
        this.id = id;
    }


    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Build getBuild() {
        return build;
    }

    public void setBuild(Build build) {
        this.build = build;
    }

    @Override
    public String toString() {
        return "AirCraft{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", build=" + build +
                '}';
    }
}
