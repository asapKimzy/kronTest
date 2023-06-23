package com.example.krontest.models;

import jakarta.persistence.*;

import java.nio.file.LinkOption;
import java.util.List;
@Entity
public class Build {
    @Id
    private Long id;

    private String name;
    private String applicabillity;



    public void setId(Long id) {
        this.id = id;
    }


    public Long getId() {
        return id;
    }

    public Build( Long id, String name, String applicabillity) {
        this.id=id;
        this.name = name;
        this.applicabillity = applicabillity;

    }

    public Build() {
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


    @Override
    public String toString() {
        return "Build{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", applicabillity='" + applicabillity + '\'' +

                '}';
    }
}
