package com.company;

import java.util.ArrayList;

public class zad4 {
    public static void main(String[] args) {
        ArrayList<Integer> lista = new ArrayList<Integer>();
        lista.add(1);
        lista.add(4);
        lista.add(9);
        lista.add(16);

        System.out.println(reversed(lista));
    }

    public static ArrayList<Integer> reversed(ArrayList<Integer> a) {
        ArrayList<Integer> lista = new ArrayList<>();
        int tab[] = new int[a.size()];
        for (int i = 0; i < a.size(); i++) {
            tab[i] = a.get(i);
        }
        for (int i = 0; i < a.size(); i++) {
            lista.add(tab[a.size() - 1 - i]);
        }
        return lista;
    }
}
