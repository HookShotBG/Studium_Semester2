package sw7;

public class Offerte {
    private Kunde kunde;
    private String beschreibung;
    private double einkaufspreis;
    private String lieferzeit;
    private int nummer;

    public Offerte(Kunde kunde, String beschreibung, int nummer){
        this.kunde = kunde;
        this.beschreibung = beschreibung;
        this.nummer = nummer;
        setLieferzeit("undefinded");
        setEinkaufspreis(1);
    }

    public void setEinkaufspreis(double einkaufspreis) {
        this.einkaufspreis = einkaufspreis;
    }

    public void setLieferzeit(String lieferzeit) {
        this.lieferzeit = lieferzeit;
    }

    public int getNummer() {
        return nummer;
    }

    public void print(){
        kunde.print();
        System.out.println("Beschreibung: " + beschreibung);
        System.out.println("Einkaufspreis: " + einkaufspreis);
        System.out.println("Verkaufspreis: " + einkaufspreis*kunde.getMarge());
        System.out.println("Lieferzeit: " + lieferzeit);
    }
}
