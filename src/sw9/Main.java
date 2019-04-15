package sw9;

public class Main {
    public static void main(String[] args) {
        Kundenmanager kMan = new Kundenmanager();
        Offertenmanager oMan = new Offertenmanager(kMan);
        kMan.addKunde("Mueller", "Gartenweg 1", "");
        kMan.addKunde("Meier AG", "Hauptstrasse 2", "CHE-123.456");
        oMan.addOfferte(100, "Ware A");
        oMan.addOfferte(101, "Ware B");
        oMan.getOfferte(1).setLieferzeit("01.02.2018");
        oMan.getOfferte(1).setEinkaufspreis(45);
        oMan.getOfferte(2).setEinkaufspreis(123.5);
        oMan.printAllOfferten();
    }
}
