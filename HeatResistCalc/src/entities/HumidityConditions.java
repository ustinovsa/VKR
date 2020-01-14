/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

/**
 *
 * @author Home
 */
public class HumidityConditions {

    private final double temperature;
    private final double relativeHumidity;
    public HumidityMode mode;

    public HumidityConditions(double temperature, double relativeHumidity) {
        this.temperature = temperature;
        this.relativeHumidity = relativeHumidity;
        check();
    }

    public int mode() {
        if ((temperature <= 12
                & relativeHumidity <= 60)
                || (temperature > 12 & temperature <= 24
                & relativeHumidity <= 50)
                || (temperature > 24
                & relativeHumidity <= 40)) {
            return 0;
        } else if ((temperature <= 12
                & relativeHumidity > 60 & relativeHumidity <= 75)
                || (temperature > 12 & temperature <= 24
                & relativeHumidity > 50 & relativeHumidity <= 60)
                || (temperature > 24
                & relativeHumidity > 40 & relativeHumidity <= 50)) {
            return 1;
        } else if ((temperature <= 12
                & relativeHumidity > 75)
                || (temperature > 12 & temperature <= 24
                & relativeHumidity > 60 & relativeHumidity <= 75)
                || (temperature > 24
                & relativeHumidity > 50 & relativeHumidity <= 60)) {
            return 2;
        } else {
            return 3;
        }
    }

    public final void check() {
        switch (mode()) {
            case 0:
                mode = HumidityMode.СУХОЙ;
                break;
            case 1:
                mode = HumidityMode.НОРМАЛЬНЫЙ;
                break;
            case 2:
                mode = HumidityMode.ВЛАЖНЫЙ;
                break;
            case 3:
                mode = HumidityMode.МОКРЫЙ;
                break;
        }
    }
}
