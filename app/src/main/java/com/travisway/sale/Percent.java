package com.travisway.sale;

/**
 * Created by travisway on 10/1/17.
 */

public class Percent {

    public double calcPercent(double amount, double percent){

        double total = amount -(amount * percent);

        return total;

    }

}
