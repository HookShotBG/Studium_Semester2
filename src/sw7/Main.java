package sw7;

public class Main {
    public static void main(String[] args) {
        Kunde k1 = new Kunde("ABC AG", "Hauptstrasse 3",100);
        Offerte o1 = new Offerte(k1,"Gussteil A",20); k1.setMarge(2.5);
        o1.setEinkaufspreis(24); o1.setLieferzeit("1.2.2018");
        System.out.println("Offertnummer: "+o1.getNummer());
        o1.print();
    }
}
