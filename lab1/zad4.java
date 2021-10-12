public class zad4 {
    public static void main(String[] args) {
        float kwota1 = 1000;
        double kwota2 = kwota1 + kwota1 * 0.06;
        System.out.println("Kwota po 1 roku: " + kwota2 +" zł");
        double kwota3 = kwota2 + kwota2 * 0.06;
        System.out.println("Kwota po 1 roku: " + kwota3 +" zł");
        double kwota4 = kwota3+ kwota3 * 0.06;
        System.out.println("Kwota po 1 roku: " + kwota4 +" zł");


    }
}
