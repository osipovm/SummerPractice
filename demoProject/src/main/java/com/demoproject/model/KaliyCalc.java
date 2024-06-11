package com.demoproject.model;


import lombok.*;


@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class KaliyCalc extends AbstractCalcClass {
    private Long id;
    private double kaliy;
    private int weight;
    private double potassium;



/*    public void init() {
        potassium = calcium + weight;
    }*/
}