/*  
 * to change this license header, choose License Headers in Project Properties.
 * to change this template file, choose tools | templates
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
public class ColdPeriod implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @Column(nullable = false)
    private String cityName;

    @Column(nullable = true)
    private double temp1d098;

    @Column(nullable = true)
    private double temp1d092;

    @Column(nullable = true)
    private double temp5d098;

    @Column(nullable = true)
    private double temp5d092;

    @Column(nullable = true)
    private double temp094;

    @Column(nullable = true)
    private double tempAbsMin;

    @Column(nullable = true)
    private double temp1dAmplitudeColdestMonth;

    @Column(nullable = true)
    private double below0DegDuration;

    @Column(nullable = true)
    private double below0DegtempMedium;

    @Column(nullable = true)
    private double below8DegDuration;

    @Column(nullable = true)
    private double below8DegtempMedium;

    @Column(nullable = true)
    private double below10DegDuration;

    @Column(nullable = true)
    private double below10DegtempMedium;

    @Column(nullable = true)
    private double averageRelativeHumidityColdestMonth;

    @Column(nullable = true)
    private double averageRelativeHumidityAt15hColdestMonth;

    @Column(nullable = true)
    private double rainfall;

    @Column(nullable = true)
    private String windDirection;

    @Column(nullable = true)
    private double windMaxMediumSpeedJanuary;

    @Column(nullable = true)
    private double windMediumSpeedBelow8Deg;

    public ColdPeriod() {
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
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

    public void setTemp1dAmplitudeColdestMonth(double temp1dAmplitudeColdestMonth) {
        this.temp1dAmplitudeColdestMonth = temp1dAmplitudeColdestMonth;
    }

    public double getBelow0DegDuration() {
        return below0DegDuration;
    }

    public void setBelow0DegDuration(double below0DegDuration) {
        this.below0DegDuration = below0DegDuration;
    }

    public double getBelow0DegtempMedium() {
        return below0DegtempMedium;
    }

    public void setBelow0DegtempMedium(double below0DegtempMedium) {
        this.below0DegtempMedium = below0DegtempMedium;
    }

    public double getBelow8DegDuration() {
        return below8DegDuration;
    }

    public void setBelow8DegDuration(double below8DegDuration) {
        this.below8DegDuration = below8DegDuration;
    }

    public double getBelow8DegtempMedium() {
        return below8DegtempMedium;
    }

    public void setBelow8DegtempMedium(double below8DegtempMedium) {
        this.below8DegtempMedium = below8DegtempMedium;
    }

    public double getBelow10DegDuration() {
        return below10DegDuration;
    }

    public void setBelow10DegDuration(double below10DegDuration) {
        this.below10DegDuration = below10DegDuration;
    }

    public double getBelow10DegtempMedium() {
        return below10DegtempMedium;
    }

    public void setBelow10DegtempMedium(double below10DegtempMedium) {
        this.below10DegtempMedium = below10DegtempMedium;
    }

    public double getAverageRelativeHumidityColdestMonth() {
        return averageRelativeHumidityColdestMonth;
    }

    public void setAverageRelativeHumidityColdestMonth(double averageRelativeHumidityColdestMonth) {
        this.averageRelativeHumidityColdestMonth = averageRelativeHumidityColdestMonth;
    }

    public double getAverageRelativeHumidityAt15hColdestMonth() {
        return averageRelativeHumidityAt15hColdestMonth;
    }

    public void setAverageRelativeHumidityAt15hColdestMonth(double averageRelativeHumidityAt15hColdestMonth) {
        this.averageRelativeHumidityAt15hColdestMonth = averageRelativeHumidityAt15hColdestMonth;
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

    public void setWindMaxMediumSpeedJanuary(double windMaxMediumSpeedJanuary) {
        this.windMaxMediumSpeedJanuary = windMaxMediumSpeedJanuary;
    }

    public double getWindMediumSpeedBelow8Deg() {
        return windMediumSpeedBelow8Deg;
    }

    public void setWindMediumSpeedBelow8Deg(double windMediumSpeedBelow8Deg) {
        this.windMediumSpeedBelow8Deg = windMediumSpeedBelow8Deg;
    }

}
