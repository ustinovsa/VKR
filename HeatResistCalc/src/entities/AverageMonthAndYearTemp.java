/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

import java.util.Calendar;
import javax.persistence.*;

/**
 *
 * @author Home
 */
public class AverageMonthAndYearTemp {

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
    private double year;

}
