package com.company;

import java.math.*;

public class zad1 {
    public static void main(String[] args) {
        System.out.println(seeds(100));
    }

    public static BigInteger seeds(int n){
        BigInteger wynik = new BigInteger("0");
        BigInteger poprzedni = new BigInteger("1");
        BigInteger aktualny = new BigInteger("1");
        if(n != 0){
            for(int i = 1; i <=n; i++){
                for(int j = 1; j<=n; j++) {
                    wynik = wynik.add(aktualny);
                    aktualny = poprzedni.multiply(new BigInteger("2"));
                    poprzedni = aktualny;
                }
            }
        }
        return wynik;
    }
}
