/*  
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.Id;

/**
 *
 * @author Home
 */
@Entity
public class City implements Serializable {
    @Id
    public String CityName;
    public double ColdPeriodTemp1d098;
    public double ColdPeriodTemp1d092;
    public double ColdPeriodTemp5d098;
    public double ColdPeriodTemp5d092;
    public double ColdPeriodTemp094;
    public double ColdPeriodTempAbsMin;
    public double ColdPeriodTemp1dAmplitude;
    public double ColdPeriodBelow0DegDuration;
    public double ColdPeriodBelow0DegTempMedium;
    public double ColdPeriodBelow8DegDuration;
    public double ColdPeriodBelow8DegTempMedium;
    public double ColdPeriodBelow10DegDuration;
    public double ColdPeriodBelow10DegTempMedium;
    public double ColdPeriodRelativeHumidity;
    public double ColdPeriodRelativeHumidityAt15h;
    public double ColdPeriodRainfall;
    public double ColdPeriodWindDirection;
    public double ColdPeriodWindMaxMediumSpeedJanuary;
    public double ColdPeriodWindMediumSpeedBelow8Deg;
    

    public String getCityName() {
        return CityName;
    }

    public void setCityName(String CityName) {
        this.CityName = CityName;
    }
    
    
    
}
