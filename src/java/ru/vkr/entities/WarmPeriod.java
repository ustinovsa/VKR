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
 * @author Home
 */
@Entity
public class WarmPeriod implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @Column(nullable = false)
    private String cityName;

    @Column(nullable = false)
    private double pressure;

    @Column(nullable = true)
    private double temp095;

    @Column(nullable = true)
    private double temp098;

    @Column(nullable = true)
    private double tempAverageMaxWarmestMonth;

    @Column(nullable = true)
    private double tempAbsMax;

    @Column(nullable = true)
    private double temp1dAmplitudeWarmestMonth;

    @Column(nullable = true)
    private double relativeHumidityWarmestMonth;

    @Column(nullable = true)
    private double relativeHumidityAt15hWarmestMonth;

    @Column(nullable = true)
    private double rainfall;

    @Column(nullable = true)
    private double rainfall1dMax;

    @Column
    private String windDirection;

    @Column(nullable = true)
    private double windMinMediumSpeedJanuary;

    public WarmPeriod() {
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public double getPressure() {
        return pressure;
    }

    public void setPressure(double pressure) {
        this.pressure = pressure;
    }

    public double getTemp095() {
        return temp095;
    }

    public void setTemp095(double temp095) {
        this.temp095 = temp095;
    }

    public double getTemp098() {
        return temp098;
    }

    public void setTemp098(double temp098) {
        this.temp098 = temp098;
    }

    public double getTempAverageMaxWarmestMonth() {
        return tempAverageMaxWarmestMonth;
    }

    public void setTempAverageMaxWarmestMonth(double tempAverageMaxWarmestMonth) {
        this.tempAverageMaxWarmestMonth = tempAverageMaxWarmestMonth;
    }

    public double getTempAbsMax() {
        return tempAbsMax;
    }

    public void setTempAbsMax(double tempAbsMax) {
        this.tempAbsMax = tempAbsMax;
    }

    public double getTemp1dAmplitudeWarmestMonth() {
        return temp1dAmplitudeWarmestMonth;
    }

    public void setTemp1dAmplitudeWarmestMonth(double temp1dAmplitudeWarmestMonth) {
        this.temp1dAmplitudeWarmestMonth = temp1dAmplitudeWarmestMonth;
    }

    public double getRelativeHumidityWarmestMonth() {
        return relativeHumidityWarmestMonth;
    }

    public void setRelativeHumidityWarmestMonth(double relativeHumidityWarmestMonth) {
        this.relativeHumidityWarmestMonth = relativeHumidityWarmestMonth;
    }

    public double getRelativeHumidityAt15hWarmestMonth() {
        return relativeHumidityAt15hWarmestMonth;
    }

    public void setRelativeHumidityAt15hWarmestMonth(double relativeHumidityAt15hWarmestMonth) {
        this.relativeHumidityAt15hWarmestMonth = relativeHumidityAt15hWarmestMonth;
    }

    public double getRainfall() {
        return rainfall;
    }

    public void setRainfall(double rainfall) {
        this.rainfall = rainfall;
    }

    public double getRainfall1dMax() {
        return rainfall1dMax;
    }

    public void setRainfall1dMax(double rainfall1dMax) {
        this.rainfall1dMax = rainfall1dMax;
    }

    public String getWindDirection() {
        return windDirection;
    }

    public void setWindDirection(String windDirection) {
        this.windDirection = windDirection;
    }

    public double getWindMinMediumSpeedJanuary() {
        return windMinMediumSpeedJanuary;
    }

    public void setWindMinMediumSpeedJanuary(double windMinMediumSpeedJanuary) {
        this.windMinMediumSpeedJanuary = windMinMediumSpeedJanuary;
    }

}
