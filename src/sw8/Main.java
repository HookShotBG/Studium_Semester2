package sw8;

public class Main {
    public static void main(String[] args) {
        Kundenmanager kMan = new Kundenmanager(); kMan.addKunde("Mueller", "Gartenweg 1", "");
        kMan.addKunde("Herzig", "Gartenzwergweg 3", "");
        kMan.addKunde("Meier AG", "Hauptstrasse 2", "CHE-123.456");
        kMan.addKunde("Obermeier AG", "Industriepark 7", "CHE-456.789");
        System.out.println("UID für Kunde 50: "+kMan.getUid(50));
        System.out.println("UID für Kunde 101: "+kMan.getUid(101));
        System.out.println("UID für Kunde 103: "+kMan.getUid(103));
        System.out.println("\nListe alle Privatkunden:");
        for (Kunde k: kMan.getPrivatKunden()) {
            k.print(); }
    }
}
