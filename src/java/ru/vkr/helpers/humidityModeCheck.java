/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ru.vkr.helpers;

/**
 *
 * @author UstinovSA <ustinov.serg.al@gmail.com>
 */
public class humidityModeCheck {

    private double temperatureInside;
    private double relativeHumidityInside;

    public static String check(double t, double rh) {
        if ((t <= 12 & rh <= 60)
                | (t > 12 & t <= 24 & rh <= 50)
                | (t > 24 & rh <= 40)) {
            return HumidityMode.СУХОЙ.name();
        } else if ((t <= 12 & rh > 60 & rh <= 75)
                | (t > 12 & t <= 24 & rh > 50 & rh <= 60)
                | (t > 24 & rh <= 40)) {
            return HumidityMode.НОРМАЛЬНЫЙ.name();
        } else if ((t <= 12 & rh > 75)
                | (t > 12 & t <= 24 & rh > 60 & rh <= 75)
                | (t > 24 & rh > 50 & rh <= 60)) {
            return HumidityMode.ВЛАЖНЫЙ.name();
        } else {
            return HumidityMode.МОКРЫЙ.name();
        }
    }
}
