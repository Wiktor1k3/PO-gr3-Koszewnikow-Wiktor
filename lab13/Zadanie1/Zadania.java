package Zadanie1;

public class Zadania implements Comparable<Zadania>{
    public int priorytet;
    public String opis;

    public Zadania(int priorytet, String opis) {
        if(priorytet>0 && priorytet < 10)
            this.priorytet = priorytet;
        else
            throw new RuntimeException("Musi to być liczba dodatnia jednocyfrowa!\n");
        this.opis = opis;
    }

    public String getOpis() {
        return opis;
    }

    public void setOpis(String opis) {
        this.opis = opis;
    }

    public int getPriorytet() {
        return priorytet;
    }

    public void setPriorytet(int priorytet) {
        if(this.priorytet > 0 && this.priorytet < 10)
            this.priorytet = priorytet;
        else
            throw new RuntimeException("PRIORYTET MUSI BYĆ DODATNIĄ LICZBĄ JEDNOCYFROWĄ !\n");
    }

    @Override
    public String toString() {
        return "Zadanie{" +
                "priorytet=" + priorytet +
                ", opis='" + opis + '\'' +
                "} ";
    }

    @Override
    public int compareTo(Zadania z) {
        if(this.priorytet == z.getPriorytet())
            return 0;
        if(this.priorytet > z.getPriorytet())
            return 1;
        else
            return -1;
    }
}
