package org.example;

public class CompoundInterest {

    public static double calculate(double capital, double rateDecimal, double years, int n){

        return capital * Math.pow(1 + (rateDecimal / n), n * years);
    }
}
