package com.demoproject.model;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class NatriyCalc extends AbstractCalcClass{
    private Long id;
    private double glucoza;
    private double natriy;
    private int calculation;


}
