package com.company;

import java.math.*;

public class zad1 {
    public static void main(String[] args) {
        System.out.println(odsetki(1000, 5, 20));
    }

    public static BigDecimal odsetki(double k, double p, int n){
        BigDecimal odsetki = new BigDecimal("1.0");
        odsetki = odsetki.add(new BigDecimal(""+p/100)).pow(n).multiply(new BigDecimal(""+k)).multiply(new BigDecimal(""+k)).multiply(new BigDecimal("0.001"));
        return odsetki;
    }
}
