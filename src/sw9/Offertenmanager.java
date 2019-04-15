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

/**
 * du hesch im offertenmanager ja die foreach wo du setzisch, mit dere chasch jedi offerte nummere usgeh
 * denn nachher holsch du aber jedi einzeli offerte und machsch de print druf.. sit dem ja jedi offerte e printfunktion het
 * und i dere print funktion vo de offerte wird ja scho de kundeprint usgführt
 *
 * eig so bildlich
 * printAllOfferten -> holt einzelne Offerte
 * einzelne Offerte -> offerte print
 * offerte print -> beinhaltet kunde print
 * kunde print -> gibt kunden aus
 *
 */
