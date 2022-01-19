import java.util.Scanner;

public class Zadanie2_Test {

    public static void main(String[] args) {

        start.start();

        Scanner scan1 = new Scanner(System.in);
        Student_List lista_studentow = new Student_List();
        String input = "";
        while (!input.equals("koniec")) {
            System.out.print("Wpisz komende: ");
            input = scan1.nextLine();
            String[] inputArr = input.split(" ");
            switch (inputArr[0]) {
                case "NOWY" -> lista_studentow.dodaj_student(inputArr[1], inputArr[2]);
                case "USUN" -> lista_studentow.usun_student(Integer.parseInt(inputArr[1]));
                case "DODAJ_OCENE" -> lista_studentow.dodaj_ocena(Integer.parseInt(inputArr[1]), inputArr[2]);
                case "ZMIEN_OCENE" -> lista_studentow.zmien_ocena(Integer.parseInt(inputArr[1]), inputArr[2]);
                case "WYSWIETL" -> lista_studentow.wyswietl();
                case "ZAKONCZ" -> input = "koniec";
                default -> {
                    System.out.println("Niepoprawna komenda!");
                    System.out.println("""
                            Dostępne komendy (w {} proszę wpisać dane) :
                            NOWY {imie} {nazwisko} : dodaje studenta o podanym imieniu i nazwisku
                            USUN {indeks} : usuniecie studenta o podanym indeksie
                            DODAJ_OCENE {ocena} : dodaje ocenę studenta o danym indeksie
                            ZMIEN_OCENE {indeks} {ocena} : zmiana oceny studenta o danym indeksie
                            WYSWIETL : wyświetlenie listy studentów
                            ZAKONCZ - wyjście z programu
                            """);
                }
            }
        }
    }
}
