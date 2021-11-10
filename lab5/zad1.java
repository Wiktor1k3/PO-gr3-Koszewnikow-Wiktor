package com.company;

import java.util.ArrayList;
import java.util.List;

public class zad1 {
    public static void main(String[] args){
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
        System.out.println(append(lista,lista2));


    }
    public static List append(ArrayList<Integer> a, ArrayList<Integer> b){
        List<Integer> lista = new ArrayList<Integer>();
        for(int i=0; i<4;i++){
            lista.add(a.get(i));
            System.out.println(lista.get(i));
        }

        for(int i=0; i<b.size() ;i++){
            lista.add(b.get(i));
            System.out.println(lista.get(i+4));
        }
        return lista;
    }
}
