/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package helpers;

/**
 *
 * @author Home
 */
public class BaseResistRequired {

    private final double regionalCoef = 1.0; // региональный коэффициент mp, 1 по умолчанию;
    private double DDHP; // Градусо-сутки отопительного периода
    private double tempInner; // расчетная температура внутреннего воздуха
    private double tempAverageOuter; // средняя температура наружного воздуха
    private double duration; /* продолжительность, сут/год, 
    отопительного периода*/
    private EnclosingStructureType type;
    
    private double baseResist; /* базовое значение требуемого 
    сопротивления теплопередаче ограждающей конструкции*/
    private double calcDDHP(){
        DDHP = (tempInner-tempAverageOuter)*duration;
        return DDHP;
    }
    private double calcBaseResist(){
        calcDDHP();
        baseResist=DDHP
        return baseResist;
    }

    public BaseResistRequired(double tempInner, double tempAverageOuter, double duration) {
        this.tempInner = tempInner;
        this.tempAverageOuter = tempAverageOuter;
        this.duration = duration;
        calcDDHP();
        calcBaseResist();
        
    }
    
    


}
