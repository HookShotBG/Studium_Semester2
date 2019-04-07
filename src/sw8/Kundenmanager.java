package sw8;

import java.util.ArrayList;
import java.util.HashMap;

public class Kundenmanager {
    private HashMap<Integer, Kunde> alleKunden = new HashMap<>();
    int nextKundenNummer = 100;

    public void addKunde(String name, String adresse, String uid){
        Kunde k;
        if(uid.isEmpty())
            k = new Privatkudne(name, adresse, nextKundenNummer);
        else
            k =  new Geschaeftskunde(name, adresse, nextKundenNummer, uid);

        alleKunden.put(nextKundenNummer, k);
        nextKundenNummer++;
    }

    public Kunde getKunde(int kNumber){
        return alleKunden.get(kNumber);
    }

    public void printAllKunden(){
        for (int key: alleKunden.keySet()) {
            Kunde x = alleKunden.get(key);
            x.print();
        }
    }

    public String getUid(int kNumber){
        Kunde x = alleKunden.get(kNumber);
        if(x instanceof Geschaeftskunde){
            return ((Geschaeftskunde) x).getUid();
        }
        else if (x instanceof Privatkudne)
            return "Das ist kein Geschäftskunde";
        else
            return "Kunde existiert nicht";
    }

    public ArrayList<Kunde> getPrivatKunden(){
        ArrayList<Kunde> privatK = new ArrayList<>();
        for (int key: alleKunden.keySet()) {
            Kunde x = alleKunden.get(key);
            if(x instanceof Privatkudne){
                privatK.add(x);
            }
        }
        return privatK;
    }
}
