package Zadanie1;
import java.util.Scanner;

public class Test {

    public static void start(){
        System.out.println("""
                NAPISZ ,dodaj priorytet', aby dodać kolejne zadanie
                NAPISZ ,następne', aby usunąć najbardziej pilne zadanie
                NAPISZ ,zakoncz', aby zakończyć program
                """);
    }
    public static String odNowa(){
        System.out.println("WPISZ NOWE POLECENIE: ");
        Scanner nowy = new Scanner(System.in);
        return nowy.nextLine();
    }

    public static void zadanie1() {

        Kolejka lista_zadan = new Kolejka();

        Scanner scan1 = new Scanner(System.in);
        Scanner scan2 = new Scanner(System.in);

        String wynik = "";

        while(!wynik.equals("zakoncz")) {

            wynik = odNowa();

            switch (wynik) {
                case "dodaj priorytet" -> {
                    System.out.println("Wpisz priorytet dodawanego zadania: ");
                    int prioritet = scan1.nextInt();
                    System.out.println("Wpisz opis dodawanego zadania: ");
                    String opiss = scan2.nextLine();
                    lista_zadan.dodaj(prioritet, opiss);
                }
                case "następne" -> {
                    System.out.println("Usuwam zadanie o najmniejszym priorytecie...\n ");
                    lista_zadan.usun();
                }
                case "zakoncz" -> System.out.println("Koniec\n ");
                default -> throw new RuntimeException("""
                        PROSZĘ WPISAĆ POPRAWNE POLECENIE, WYBIERZ JEDNO Z PONIŻSZYCH :\s
                        NAPISZ ,dodaj priorytet', aby dodać kolejne zadanie
                        NAPISZ ,następne', aby usunąć najbardziej pilne zadanie
                        NAPISZ ,zakoncz', aby zakończyć program
                        """);
            }
        }
        System.out.println("WYNIK : \n");
        lista_zadan.wypisz();
    }


    public static void main(String[] args) {

        start();

        zadanie1();

    }
}
