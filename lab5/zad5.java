package com.company;

import java.util.ArrayList;

public class zad5 {
    public static void main(String[] args) {
        ArrayList<Integer> lista = new ArrayList<Integer>();
        lista.add(1);
        lista.add(4);
        lista.add(9);
        lista.add(16);

        reverse(lista);
        System.out.println(lista);
    }
    public static void reverse(ArrayList<Integer> a) {

        int tab[] = new int[a.size()];
        for (int i = 0; i < a.size(); i++) {
            tab[i] = a.get(i);
        }
        for (int i = 0; i < a.size(); i++) {
            a.set(i, tab[a.size()-i-1]);
        }
    }
}
