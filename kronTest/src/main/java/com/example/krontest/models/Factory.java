package com.example.krontest.models;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

import java.util.List;

@Entity
public class Factory {
    @Id
    private Long id;
    private String name;

    private int number;
    @OneToMany
    private List<Detail> detail;

    public String getName() {
        return name;
    }

    public Factory(Long id, String name, int number, List<Detail> detail) {
        this.id=id;
        this.name = name;
        this.number = number;
        this.detail = detail;
    }

    public Factory() {
    }

    public List<Detail> getDetail() {
        return detail;
    }

    public void setDetail(List<Detail> detail) {
        this.detail = detail;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public void setId(Long id) {
        this.id = id;
    }


    public Long getId() {
        return id;
    }
}
