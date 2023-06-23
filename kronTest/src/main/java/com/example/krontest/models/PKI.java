package com.example.krontest.models;

import jakarta.persistence.*;

@Entity
public class PKI {
    @Id

    private Long id;
    private String name;
    private String article;
    private String manufacturer;
    @ManyToOne
    private Build build;

    public Build getBuild() {
        return build;
    }

    public void setBuild(Build build) {
        this.build = build;
    }

    public void setId(Long id) {
        this.id = id;
    }


    public Long getId() {
        return id;
    }

    public PKI(Long id, String name, String article, String manufacturer) {
        this.id=id;
        this.name = name;
        this.article = article;
        this.manufacturer = manufacturer;
    }

    public PKI() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getArticle() {
        return article;
    }

    public void setArticle(String article) {
        this.article = article;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    @Override
    public String toString() {
        return "PKI{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", article='" + article + '\'' +
                ", manufacturer='" + manufacturer + '\'' +
                '}';
    }
}
