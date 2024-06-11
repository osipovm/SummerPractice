package com.demoproject.model;


import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class PercentCalc extends AbstractCalcClass {
    private Long id;
    private double percent;
    private double volume;
    private int calculation;


/*    public void init{

    }*/
}

