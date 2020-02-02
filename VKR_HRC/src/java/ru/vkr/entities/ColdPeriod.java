/*  
 * to change this license header, choose License Headers in Project Properties.
 * to change this template file, choose tools | templates
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
@Table(name="ColdPeriod")
public class ColdPeriod implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id",
            unique=true)
    private long id;

    @Column(name = "city",
            nullable = false)
    private String city;

    @Column(name = "temp1d098")
    private double temp1d098;

    @Column(name = "temp1d092")
    private double temp1d092;

    @Column(name = "temp5d098")
    private double temp5d098;

    @Column(name = "temp5d092")
    private double temp5d092;

    @Column(name = "temp094")
    private double temp094;

    @Column(name = "tempAbsMin")
    private double tempAbsMin;

    @Column(name = "temp1dAmplitudeColdestMonth")
    private double temp1dAmplitudeColdestMonth;

    @Column(name = "below0DegDuration")
    private double below0DegDuration;

    @Column(name = "below0DegtempMedium")
    private double below0DegtempMedium;

    @Column(name = "below8DegDuration")
    private double below8DegDuration;

    @Column(name = "below8DegtempMedium")
    private double below8DegtempMedium;

    @Column(name = "below10DegDuration")
    private double below10DegDuration;

    @Column(name = "below10DegtempMedium")
    private double below10DegtempMedium;

    @Column(name = "averageRelativeHumidityColdestMonth")
    private double averageRelativeHumidityColdestMonth;

    @Column(name = "averageRelativeHumidityAt15hColdestMonth")
    private double averageRelativeHumidityAt15hColdestMonth;

    @Column(name = "rainfall")
    private double rainfall;

    @Column(name = "windDirection")
    private String windDirection;

    @Column(name = "windMaxMediumSpeedJanuary")
    private double windMaxMediumSpeedJanuary;

    @Column(name = "windMediumSpeedBelow8Deg")
    private double windMediumSpeedBelow8Deg;

    public ColdPeriod() {
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public double getTemp1d098() {
        return temp1d098;
    }

    public void setTemp1d098(double temp1d098) {
        this.temp1d098 = temp1d098;
    }

    public double getTemp1d092() {
        return temp1d092;
    }

    public void setTemp1d092(double temp1d092) {
        this.temp1d092 = temp1d092;
    }

    public double getTemp5d098() {
        return temp5d098;
    }

    public void setTemp5d098(double temp5d098) {
        this.temp5d098 = temp5d098;
    }

    public double getTemp5d092() {
        return temp5d092;
    }

    public void setTemp5d092(double temp5d092) {
        this.temp5d092 = temp5d092;
    }

    public double getTemp094() {
        return temp094;
    }

    public void setTemp094(double temp094) {
        this.temp094 = temp094;
    }

    public double getTempAbsMin() {
        return tempAbsMin;
    }

    public void setTempAbsMin(double tempAbsMin) {
        this.tempAbsMin = tempAbsMin;
    }

    public double getTemp1dAmplitudeColdestMonth() {
        return temp1dAmplitudeColdestMonth;
    }

    public void setTemp1dAmplitudeColdestMonth(
            double temp1dAmplitudeColdestMonth) {
        this.temp1dAmplitudeColdestMonth
                = temp1dAmplitudeColdestMonth;
    }

    public double getBelow0DegDuration() {
        return below0DegDuration;
    }

    public void setBelow0DegDuration(
            double below0DegDuration) {
        this.below0DegDuration
                = below0DegDuration;
    }

    public double getBelow0DegtempMedium() {
        return below0DegtempMedium;
    }

    public void setBelow0DegtempMedium(
            double below0DegtempMedium) {
        this.below0DegtempMedium
                = below0DegtempMedium;
    }

    public double getBelow8DegDuration() {
        return below8DegDuration;
    }

    public void setBelow8DegDuration(
            double below8DegDuration) {
        this.below8DegDuration
                = below8DegDuration;
    }

    public double getBelow8DegtempMedium() {
        return below8DegtempMedium;
    }

    public void setBelow8DegtempMedium(
            double below8DegtempMedium) {
        this.below8DegtempMedium
                = below8DegtempMedium;
    }

    public double getBelow10DegDuration() {
        return below10DegDuration;
    }

    public void setBelow10DegDuration(
            double below10DegDuration) {
        this.below10DegDuration
                = below10DegDuration;
    }

    public double getBelow10DegtempMedium() {
        return below10DegtempMedium;
    }

    public void setBelow10DegtempMedium(
            double below10DegtempMedium) {
        this.below10DegtempMedium
                = below10DegtempMedium;
    }

    public double getAverageRelativeHumidityColdestMonth() {
        return averageRelativeHumidityColdestMonth;
    }

    public void setAverageRelativeHumidityColdestMonth(
            double averageRelativeHumidityColdestMonth) {
        this.averageRelativeHumidityColdestMonth
                = averageRelativeHumidityColdestMonth;
    }

    public double getAverageRelativeHumidityAt15hColdestMonth() {
        return averageRelativeHumidityAt15hColdestMonth;
    }

    public void setAverageRelativeHumidityAt15hColdestMonth(
            double averageRelativeHumidityAt15hColdestMonth) {
        this.averageRelativeHumidityAt15hColdestMonth
                = averageRelativeHumidityAt15hColdestMonth;
    }

    public double getRainfall() {
        return rainfall;
    }

    public void setRainfall(double rainfall) {
        this.rainfall = rainfall;
    }

    public String getWindDirection() {
        return windDirection;
    }

    public void setWindDirection(String windDirection) {
        this.windDirection = windDirection;
    }

    public double getWindMaxMediumSpeedJanuary() {
        return windMaxMediumSpeedJanuary;
    }

    public void setWindMaxMediumSpeedJanuary(
            double windMaxMediumSpeedJanuary) {
        this.windMaxMediumSpeedJanuary
                = windMaxMediumSpeedJanuary;
    }

    public double getWindMediumSpeedBelow8Deg() {
        return windMediumSpeedBelow8Deg;
    }

    public void setWindMediumSpeedBelow8Deg(
            double windMediumSpeedBelow8Deg) {
        this.windMediumSpeedBelow8Deg
                = windMediumSpeedBelow8Deg;
    }

}
