package com.example.krontest.models;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class Assembly {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @OneToMany
    private List<Detail> detailContent;
    @OneToMany
    private List<PKI> pkiContent;
    public void setId(Long id) {
        this.id = id;
    }


    public Long getId() {
        return id;
    }

    public Assembly(List<Detail> detailContent, List<PKI> pkiContent) {
        this.detailContent = detailContent;
        this.pkiContent = pkiContent;
    }

    public Assembly() {
    }

    public List<Detail> getDetailContent() {
        return detailContent;
    }

    public void setDetailContent(List<Detail> detailContent) {
        this.detailContent = detailContent;
    }

    public List<PKI> getPkiContent() {
        return pkiContent;
    }

    public void setPkiContent(List<PKI> pkiContent) {
        this.pkiContent = pkiContent;
    }

    @Override
    public String toString() {
        return "Assembly{" +
                "id=" + id +
                ", detailContent=" + detailContent +
                ", pkiContent=" + pkiContent +
                '}';
    }
}
