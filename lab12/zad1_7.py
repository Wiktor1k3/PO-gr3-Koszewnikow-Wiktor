//--------------ZADANIA OD 1 DO 7------------------

import java.util.*;

public class zad1_7 {
    public static void redukuj(LinkedList<String> pracownicy, int n){
        if(n>0){
            for(int i=n-1; i<pracownicy.size(); i=i+n-1){
                pracownicy.remove(i);
            }
        }
    }

    public static <T> void redukuj_generycznie(List<T> pracownicy, int n){
        if(n>0){
            for(int i=n-1; i<pracownicy.size(); i=i+n-1){
                pracownicy.remove(i);
            }
        }
    }

    public static void odwroc(LinkedList<String> lista){
        Collections.reverse(lista);
    }

    public static <T> void odwroc_generycznie(LinkedList<T> lista){
        Collections.reverse(lista);
    }


    public static void main(String[] args) {
        System.out.println("----ZAD 1---");
        LinkedList<String> pracownicy1 = new LinkedList<String>();
        pracownicy1.add("Nowak");
        pracownicy1.add("Kowal");
        pracownicy1.add("Borowski");
        pracownicy1.add("Trybula");
        pracownicy1.add("Pleta");
        pracownicy1.add("Nowacki");


        System.out.println("Pierwotna lista:");
        for (String p : pracownicy1) {
            System.out.println(p);
        }

        System.out.println("\nLista po redukcji:");
        redukuj(pracownicy1,3);
        for (String x : pracownicy1) {
            System.out.println(x);
        }

        System.out.println("\n----ZAD 2---");
        List<String> pracownicy_nr1 = new ArrayList<String>();
        pracownicy_nr1.add("Markowski");
        pracownicy_nr1.add("Jaroszewicz");
        pracownicy_nr1.add("Milon");
        List<String> pracownicy_nr2 = new ArrayList<String>();
        pracownicy_nr2.add("Kowalski");
        pracownicy_nr2.add("Malek");
        pracownicy_nr2.add("Maklowisz");
        List<String> pracownicy_nr3 = new ArrayList<String>();
        pracownicy_nr3.add("Andrzejewski");
        pracownicy_nr3.add("Lampel");
        pracownicy_nr3.add("Konel");

        List<Object>lista_pracownikow = new ArrayList<>();
        lista_pracownikow.add(pracownicy_nr1);
        lista_pracownikow.add(pracownicy_nr2);
        lista_pracownikow.add(pracownicy_nr3);

        System.out.println("Pierwszy przyklad:");
        System.out.println("Pierwotna lista:");
        for (Object p : lista_pracownikow) {
            System.out.println(p);
        }

        System.out.println("\nLista po redukcji generycznej:");
        redukuj_generycznie(lista_pracownikow,2);
        for (Object t : lista_pracownikow) {
            System.out.println(t);
        }

        System.out.println("\nDrugi przyklad:");
        Osoba pierwsza = new Osoba("Kowalski", 2001);
        Osoba druga = new Osoba("Malek", 1999);
        Osoba trzecia = new Osoba("Januszewski", 1980);
        Osoba czwarta = new Osoba("Markiewicz", 1989);

        List<Osoba> Spis_ludzi = new ArrayList<>();
        Spis_ludzi.add(pierwsza);
        Spis_ludzi.add(druga);
        Spis_ludzi.add(trzecia);

        System.out.println("Pierwotna lista:");
        for (Osoba p : Spis_ludzi) {
            System.out.println(p);
        }

        System.out.println("\nLista po redukcji generycznej:");
        redukuj_generycznie(Spis_ludzi,2);
        for (Osoba p : Spis_ludzi) {
            System.out.println(p);
        }

        System.out.println("\n----ZAD 3---");
        LinkedList<String> lista1 = new LinkedList<String>();
        lista1.add("Nowak");
        lista1.add("Kowal");
        lista1.add("Borowski");
        lista1.add("Trybula");
        lista1.add("Pleta");
        lista1.add("Nowacki");

        System.out.println("Pierwotna lista:");
        for (String p : lista1) {
            System.out.println(p);
        }

        System.out.println("\nLista po odwroceniu:");
        odwroc(lista1);
        for (String p : lista1) {
            System.out.println(p);
        }

        System.out.println("\n----ZAD 4---");
        LinkedList<Osoba> Spis_ludzi2 = new LinkedList<>();
        Spis_ludzi2.add(pierwsza);
        Spis_ludzi2.add(druga);
        Spis_ludzi2.add(trzecia);
        Spis_ludzi2.add(czwarta);

        System.out.println("Pierwotna lista:");
        for (Osoba p : Spis_ludzi2) {
            System.out.println(p);
        }

        System.out.println("\nLista po odwroceniu generycznym:");
        odwroc_generycznie(Spis_ludzi2);
        for (Osoba p : Spis_ludzi2) {
            System.out.println(p);
        }

        System.out.println("\n----ZAD 5---");
        Stack<String> stos1 = new Stack<>();
        Stack<String> stos2 = new Stack<>();
        Stack<String> stos3 = new Stack<>();
        stos1.add("Ala");
        stos1.add("ma");
        stos1.add("kota.");
        stos2.add("Jej");
        stos2.add("kot");
        stos2.add("lubi");
        stos2.add("myszy.");
        System.out.print(stos1);
        System.out.println(stos2);
        Collections.reverse(stos1);
        for(String x: stos1){
            if(x.endsWith(".")){
                stos3.add(x.substring(0, 1).toUpperCase() + x.substring(1, x.length() - 1));}
            else if(x.equals(stos1.lastElement()))
                stos3.add(x.toLowerCase() + ".");
            else
                stos3.add(x.toLowerCase());
        }
        Collections.reverse(stos2);
        for(String s55: stos2){
            if(s55.endsWith("."))
                stos3.add(s55.substring(0, 1).toUpperCase() + s55.substring(1, s55.length() - 1));
            else if(s55.equals(stos2.lastElement()))
                stos3.add(s55.toLowerCase() + ".");
            else
                stos3.add(s55.toLowerCase());
        }
        System.out.println(stos3);

        System.out.println("\n----ZAD 6---");

        int liczba = 2015;
        System.out.println(Integer.toString(liczba));
        int len = Integer.toString(liczba).length();
        Stack<Integer> stos = new Stack<>();
        for(int i=0; i<len; i++){
            stos.add(liczba%10);
            liczba=liczba/10;
        }
        for(int j=0; j<=stos.size()+2; j++){
            System.out.print(stos.pop() + " ");
        }

        System.out.println("\n\n----ZAD 7---");
        int from = 2;
        int n = 20;
        int i;
        boolean[] a = new boolean[n+1];
        Arrays.fill(a, true);
        a[0] = false;
        a[1] = false;
        for(i=2; i<=Math.sqrt(n); i++)
            if(a[i]=true)
                for(int j=i*i; j<=n; j=j+i){
                    a[j] = false;
                }
        for(i=from; i<=n; i++){
            if(a[i])
                System.out.print(i + " ");
        }
    }

}
