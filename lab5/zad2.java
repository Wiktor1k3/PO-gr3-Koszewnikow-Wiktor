package com.company;

import java.util.ArrayList;
import java.util.List;

public class zad2 {
    public static void main(String[] args) {
        ArrayList<Integer> lista = new ArrayList<Integer>();
        lista.add(1);
        lista.add(4);
        lista.add(9);
        lista.add(16);
        ArrayList<Integer> lista2 = new ArrayList<Integer>();
        lista2.add(9);
        lista2.add(7);
        lista2.add(4);
        lista2.add(9);
        lista2.add(11);
        System.out.println(merge(lista, lista2));
    }

    public static ArrayList<Integer> merge(ArrayList<Integer> a, ArrayList<Integer> b) {
        List<Integer> lista = new ArrayList<Integer>();
        if (a.size() >= b.size()) {
            for (int i = 0; i < a.size(); i++) {
                lista.add(a.get(i));
                if (i < b.size()) {
                    lista.add(b.get(i));
                }
            }
        }
        if (a.size() < b.size()) {
            for (int i = 0; i < b.size(); i++) {
                if (i < a.size()) {
                    lista.add(a.get(i));
                }
                lista.add(b.get(i));
            }
        }
        return (ArrayList<Integer>) lista;
    }
}
