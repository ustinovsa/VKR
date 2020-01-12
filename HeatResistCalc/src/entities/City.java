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
public class City implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @Column(nullable = false)
    private String CityName;

    @Column(nullable = true)
    private double ColdPeriodTemp1d098;

    @Column(nullable = true)
    private double ColdPeriodTemp1d092;

    @Column(nullable = true)
    private double ColdPeriodTemp5d098;

    @Column(nullable = true)
    private double ColdPeriodTemp5d092;

    @Column(nullable = true)
    private double ColdPeriodTemp094;

    @Column(nullable = true)
    private double ColdPeriodTempAbsMin;

    @Column(nullable = true)
    private double ColdPeriodTemp1dAmplitude;

    @Column(nullable = true)
    private double ColdPeriodBelow0DegDuration;

    @Column(nullable = true)
    private double ColdPeriodBelow0DegTempMedium;

    @Column(nullable = true)
    private double ColdPeriodBelow8DegDuration;

    @Column(nullable = true)
    private double ColdPeriodBelow8DegTempMedium;

    @Column(nullable = true)
    private double ColdPeriodBelow10DegDuration;

    @Column(nullable = true)
    private double ColdPeriodBelow10DegTempMedium;

    @Column(nullable = true)
    private double ColdPeriodRelativeHumidity;

    @Column(nullable = true)
    private double ColdPeriodRelativeHumidityAt15h;

    @Column(nullable = true)
    private double ColdPeriodRainfall;

    @Column
    private String ColdPeriodWindDirection;

    @Column(nullable = true)
    private double ColdPeriodWindMaxMediumSpeedJanuary;

    @Column(nullable = true)
    private double ColdPeriodWindMediumSpeedBelow8Deg;

    public String getCityName() {
        return CityName;
    }

    public void setCityName(String CityName) {
        this.CityName = CityName;
    }

    public double getColdPeriodTemp1d098() {
        return ColdPeriodTemp1d098;
    }

    public void setColdPeriodTemp1d098(double ColdPeriodTemp1d098) {
        this.ColdPeriodTemp1d098 = ColdPeriodTemp1d098;
    }

    public double getColdPeriodTemp1d092() {
        return ColdPeriodTemp1d092;
    }

    public void setColdPeriodTemp1d092(double ColdPeriodTemp1d092) {
        this.ColdPeriodTemp1d092 = ColdPeriodTemp1d092;
    }

    public double getColdPeriodTemp5d098() {
        return ColdPeriodTemp5d098;
    }

    public void setColdPeriodTemp5d098(double ColdPeriodTemp5d098) {
        this.ColdPeriodTemp5d098 = ColdPeriodTemp5d098;
    }

    public double getColdPeriodTemp5d092() {
        return ColdPeriodTemp5d092;
    }

    public void setColdPeriodTemp5d092(double ColdPeriodTemp5d092) {
        this.ColdPeriodTemp5d092 = ColdPeriodTemp5d092;
    }

    public double getColdPeriodTemp094() {
        return ColdPeriodTemp094;
    }

    public void setColdPeriodTemp094(double ColdPeriodTemp094) {
        this.ColdPeriodTemp094 = ColdPeriodTemp094;
    }

    public double getColdPeriodTempAbsMin() {
        return ColdPeriodTempAbsMin;
    }

    public void setColdPeriodTempAbsMin(double ColdPeriodTempAbsMin) {
        this.ColdPeriodTempAbsMin = ColdPeriodTempAbsMin;
    }

    public double getColdPeriodTemp1dAmplitude() {
        return ColdPeriodTemp1dAmplitude;
    }

    public void setColdPeriodTemp1dAmplitude(double ColdPeriodTemp1dAmplitude) {
        this.ColdPeriodTemp1dAmplitude = ColdPeriodTemp1dAmplitude;
    }

    public double getColdPeriodBelow0DegDuration() {
        return ColdPeriodBelow0DegDuration;
    }

    public void setColdPeriodBelow0DegDuration(double ColdPeriodBelow0DegDuration) {
        this.ColdPeriodBelow0DegDuration = ColdPeriodBelow0DegDuration;
    }

    public double getColdPeriodBelow0DegTempMedium() {
        return ColdPeriodBelow0DegTempMedium;
    }

    public void setColdPeriodBelow0DegTempMedium(double ColdPeriodBelow0DegTempMedium) {
        this.ColdPeriodBelow0DegTempMedium = ColdPeriodBelow0DegTempMedium;
    }

    public double getColdPeriodBelow8DegDuration() {
        return ColdPeriodBelow8DegDuration;
    }

    public void setColdPeriodBelow8DegDuration(double ColdPeriodBelow8DegDuration) {
        this.ColdPeriodBelow8DegDuration = ColdPeriodBelow8DegDuration;
    }

    public double getColdPeriodBelow8DegTempMedium() {
        return ColdPeriodBelow8DegTempMedium;
    }

    public void setColdPeriodBelow8DegTempMedium(double ColdPeriodBelow8DegTempMedium) {
        this.ColdPeriodBelow8DegTempMedium = ColdPeriodBelow8DegTempMedium;
    }

    public double getColdPeriodBelow10DegDuration() {
        return ColdPeriodBelow10DegDuration;
    }

    public void setColdPeriodBelow10DegDuration(double ColdPeriodBelow10DegDuration) {
        this.ColdPeriodBelow10DegDuration = ColdPeriodBelow10DegDuration;
    }

    public double getColdPeriodBelow10DegTempMedium() {
        return ColdPeriodBelow10DegTempMedium;
    }

    public void setColdPeriodBelow10DegTempMedium(double ColdPeriodBelow10DegTempMedium) {
        this.ColdPeriodBelow10DegTempMedium = ColdPeriodBelow10DegTempMedium;
    }

    public double getColdPeriodRelativeHumidity() {
        return ColdPeriodRelativeHumidity;
    }

    public void setColdPeriodRelativeHumidity(double ColdPeriodRelativeHumidity) {
        this.ColdPeriodRelativeHumidity = ColdPeriodRelativeHumidity;
    }

    public double getColdPeriodRelativeHumidityAt15h() {
        return ColdPeriodRelativeHumidityAt15h;
    }

    public void setColdPeriodRelativeHumidityAt15h(double ColdPeriodRelativeHumidityAt15h) {
        this.ColdPeriodRelativeHumidityAt15h = ColdPeriodRelativeHumidityAt15h;
    }

    public double getColdPeriodRainfall() {
        return ColdPeriodRainfall;
    }

    public void setColdPeriodRainfall(double ColdPeriodRainfall) {
        this.ColdPeriodRainfall = ColdPeriodRainfall;
    }

    public String getColdPeriodWindDirection() {
        return ColdPeriodWindDirection;
    }

    public void setColdPeriodWindDirection(String ColdPeriodWindDirection) {
        this.ColdPeriodWindDirection = ColdPeriodWindDirection;
    }

    public double getColdPeriodWindMaxMediumSpeedJanuary() {
        return ColdPeriodWindMaxMediumSpeedJanuary;
    }

    public void setColdPeriodWindMaxMediumSpeedJanuary(double ColdPeriodWindMaxMediumSpeedJanuary) {
        this.ColdPeriodWindMaxMediumSpeedJanuary = ColdPeriodWindMaxMediumSpeedJanuary;
    }

    public double getColdPeriodWindMediumSpeedBelow8Deg() {
        return ColdPeriodWindMediumSpeedBelow8Deg;
    }

    public void setColdPeriodWindMediumSpeedBelow8Deg(double ColdPeriodWindMediumSpeedBelow8Deg) {
        this.ColdPeriodWindMediumSpeedBelow8Deg = ColdPeriodWindMediumSpeedBelow8Deg;
    }

}
