public class start {
    public static void start(){
        System.out.println("""
                Dostępne komendy (w {} proszę wpisać dane) :\s
                NOWY {imie} {nazwisko} : dodaje studenta o podanym imieniu i nazwisku\s
                USUN {indeks} : usuniecie studenta o podanym indeksie\s
                DODAJ_OCENE {ocena} : dodaje ocenę studenta o danym indeksie\s
                ZMIEN_OCENE {indeks} {ocena} : zmiana oceny studenta o danym indeksie\s
                WYSWIETL : wyświetlenie listy studentów\s
                ZAKONCZ - wyjście z programu\s
                """);
    }
}
