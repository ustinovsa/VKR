/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ru.vkr.entities;

import java.io.Serializable;
import javax.persistence.*;

/**
 *
 * @author UstinovSA <ustinov.serg.al@gmail.com>
 */
@Entity
@Table(name = "Country")
public class Country implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id",
            unique = true)
    private long id;

    @Column(name = "name",
            unique = true,
            nullable = false)
    private String name;

    @Column(name = "Region",
            unique = true,
            nullable = false)
    private String region;

    @Column(name = "City",
            unique = true,
            nullable = false)
    private String city;

    protected Country() {
    }

    public Country(String name, String region, String city) {
        this.name = name;
        this.region = region;
        this.city = city;
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

    
}
