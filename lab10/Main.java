import Osoba.Osoba;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;

public class Main {

    public static void main(String[] args) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        String date = "1999-06-16";
        String date2 = "2002-03-11";
        String date3 = "1995-01-20";

        LocalDate ld1 = LocalDate.parse(date, formatter);
        LocalDate ld2 = LocalDate.parse(date2, formatter);
        LocalDate ld3 = LocalDate.parse(date3, formatter);

        Osoba o1 = new Osoba("Kowalski", ld1);
        Osoba o2 = new Osoba("Kor", ld2);
        Osoba o3 = new Osoba("Nowak", ld3);
        Osoba o4 = new Osoba("Nowak", ld2);
        Osoba o5 = new Osoba("Jaworski", ld1);

        ArrayList<Osoba> lista = new ArrayList<Osoba>();
        lista.add(o1);
        lista.add(o2);
        lista.add(o3);
        lista.add(o4);
        lista.add(o5);

        System.out.println(lista);
        lista.sort(Comparator.naturalOrder());
        System.out.println(lista);
        System.out.println(o1.equals(o2));
        System.out.println(o1.compareTo(o3));
        System.out.println(o1);

        String one = "jeden";
        String dwa = "dwa";
        System.out.println(dwa.compareTo(one));

    }

}
