package sw9;

import java.util.HashMap;

public class Offertenmanager {
    private HashMap<Integer, Offerte> alleOfferten = new HashMap<>();
    private Kundenmanager kundenmanager;
    private int nextOffertenNumber = 1;


    public Offertenmanager(Kundenmanager k){
        this.kundenmanager = k;
    }

    public void addOfferte(int kNumber, String beschreibung) {
        Offerte o = new Offerte(kundenmanager.getKunde(kNumber), beschreibung, nextOffertenNumber);
        alleOfferten.put(nextOffertenNumber, o);
        nextOffertenNumber++;
    }

    public Offerte getOfferte(int oNumber){
        return alleOfferten.get(oNumber);
    }

    public void printAllOfferten(){
        for (int i: alleOfferten.keySet()) {
            System.out.println("Offertennummer: " + alleOfferten.get(i).getNummer());
            alleOfferten.get(i).print();
        }
    }

}
