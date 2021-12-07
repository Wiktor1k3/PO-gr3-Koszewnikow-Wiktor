package pl.imiaj.koszewnikow;

import pl.imiaj.koszewnikow.Instruments.Flet;
import pl.imiaj.koszewnikow.Instruments.Fortepian;
import pl.imiaj.koszewnikow.Instruments.Instrument;
import pl.imiaj.koszewnikow.Instruments.Skrzypce;

import java.time.LocalDate;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {


        ArrayList<Instrument> orkiestra = new ArrayList<>();
        orkiestra.add(new Fortepian("Michał", LocalDate.now()));
        orkiestra.add(new Flet("Andrzej", LocalDate.now()));
        orkiestra.add(new Skrzypce("Patryk", LocalDate.now()));
        orkiestra.add(new Skrzypce("Kuba", LocalDate.now()));
        orkiestra.add(new Skrzypce("Jan", LocalDate.now()));


        for(int i = 0; i <= orkiestra.size()-1; i++){
            orkiestra.get(i).dzwiek();

        }

    }
}
