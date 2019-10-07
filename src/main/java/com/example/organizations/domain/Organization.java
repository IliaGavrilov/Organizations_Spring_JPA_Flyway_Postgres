package com.example.organizations.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.Digits;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
import javax.persistence.*;

/* Класс сущности */
@Entity
@Table(name = "organization")
public class Organization {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    @Column(name = "id", updatable = false, nullable = false)
    private Long id;

    @Column(name = "tax", unique=true)
    @Digits(integer=10, fraction=0)
    @Size(min=10, max=10)
    private String tax;

    @Column(name = "reg", unique=true)
    @Digits(integer=13, fraction=0)
    @Size(min=13, max=13)
    private String reg;

    @Column(name = "name", unique=true)
    @NotBlank
    @Size(max=2048)
    private String name;

    @Column(name = "region")
    @NotBlank
    @Size(max=255)
    private String region;

    @Column(name = "city")
    @NotBlank
    @Size(max=255)
    private String city;

    @Column(name = "address")
    @NotBlank
    @Size(max=2048)
    private String address;

    public Organization() {
    }

    public Organization(String tax, String reg, String name, String region, String city, String address) {
        this.tax = tax;
        this.reg = reg;
        this.name = name;
        this.region = region;
        this.city = city;
        this.address = address;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTax() {
        return tax;
    }

    public void setTax(String tax) {
        this.tax = tax;
    }

    public String getReg() {
        return reg;
    }

    public void setReg(String reg) {
        this.reg = reg;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

}
