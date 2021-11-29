package com.example.Broodjes;

import javax.persistence.*;

@Entity
@Table
public class Broodje {
@Id
@GeneratedValue
        (
                strategy = GenerationType.IDENTITY
        )
private Long broodjeId;
private String name;
private Double price;

    public Broodje(Long broodjeId, String name, Double price) {
        this.broodjeId = broodjeId;
        this.name = name;
        this.price = price;
    }
    public Broodje( String name, Double price) {
        this.name = name;
        this.price = price;
    }

    public Long getBroodjeId() {
        return broodjeId;
    }

    public void setBroodjeId(Long broodjeId) {
        this.broodjeId = broodjeId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }
}
