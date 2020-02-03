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
public class Maximum1dTempAmplitudeAtJuly implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @Column(nullable = false)
    private String cityName;

    @Column(nullable = false)
    private double maxTempAmplitude;

    public Maximum1dTempAmplitudeAtJuly() {
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public double getMaxTempAmplitude() {
        return maxTempAmplitude;
    }

    public void setMaxTempAmplitude(double maxTempAmplitude) {
        this.maxTempAmplitude = maxTempAmplitude;
    }

}
