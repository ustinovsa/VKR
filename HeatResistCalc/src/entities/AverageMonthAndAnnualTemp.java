/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

import java.io.Serializable;
import javax.persistence.*;

/**
 *
 * @author Home
 */
@Entity
public class AverageMonthAndAnnualTemp implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @Column(nullable = false)
    private String cityName;

    @Column(nullable = true)
    private double january;

    @Column(nullable = true)
    private double february;

    @Column(nullable = true)
    private double march;

    @Column(nullable = true)
    private double april;

    @Column(nullable = true)
    private double may;

    @Column(nullable = true)
    private double june;

    @Column(nullable = true)
    private double jule;

    @Column(nullable = true)
    private double august;

    @Column(nullable = true)
    private double september;

    @Column(nullable = true)
    private double october;

    @Column(nullable = true)
    private double november;

    @Column(nullable = true)
    private double december;

    @Column(nullable = true)
    private double annual;

    public AverageMonthAndAnnualTemp() {
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public double getJanuary() {
        return january;
    }

    public void setJanuary(double january) {
        this.january = january;
    }

    public double getFebruary() {
        return february;
    }

    public void setFebruary(double february) {
        this.february = february;
    }

    public double getMarch() {
        return march;
    }

    public void setMarch(double march) {
        this.march = march;
    }

    public double getApril() {
        return april;
    }

    public void setApril(double april) {
        this.april = april;
    }

    public double getMay() {
        return may;
    }

    public void setMay(double may) {
        this.may = may;
    }

    public double getJune() {
        return june;
    }

    public void setJune(double june) {
        this.june = june;
    }

    public double getJule() {
        return jule;
    }

    public void setJule(double jule) {
        this.jule = jule;
    }

    public double getAugust() {
        return august;
    }

    public void setAugust(double august) {
        this.august = august;
    }

    public double getSeptember() {
        return september;
    }

    public void setSeptember(double september) {
        this.september = september;
    }

    public double getOctober() {
        return october;
    }

    public void setOctober(double october) {
        this.october = october;
    }

    public double getNovember() {
        return november;
    }

    public void setNovember(double november) {
        this.november = november;
    }

    public double getDecember() {
        return december;
    }

    public void setDecember(double december) {
        this.december = december;
    }

    public double getAnnual() {
        return annual;
    }

    public void setAnnual(double annual) {
        this.annual = annual;
    }

   

}
