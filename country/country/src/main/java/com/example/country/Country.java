package com.example.country;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity

public class Country {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column
    private String country;

    public void SetId(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void SetCountry(String country) {
        this.country = country;
    }

    public String getCountry() {
        return country;
    }
}