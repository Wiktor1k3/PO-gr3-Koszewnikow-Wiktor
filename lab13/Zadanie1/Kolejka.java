package Zadanie1;

import java.util.PriorityQueue;


public class Kolejka{

    public PriorityQueue<Zadania> Kolejka;


    public Kolejka() {
        this.Kolejka = new PriorityQueue<>();
    }

    public PriorityQueue<Zadania> getKolejka() {
        return Kolejka;
    }

    public void dodaj(int priorytet, String opis){
        this.Kolejka.add(new Zadania(priorytet, opis));
    }

    public void usun(){
        this.Kolejka.poll(); //deletes first element of queue
    }

    public void wypisz(){
        for(Zadania k: this.Kolejka){
            System.out.println(k);
        }
    }
}
