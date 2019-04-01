package sw7;

public class Kunde {

    private String name;
    private String adresse;
    private double marge = 2;
    private int nummer;

    public Kunde(String name, String adresse, int nummer){
        this.name = name;
        this.adresse = adresse;
        this.nummer = nummer;
    }

    public void print(){
        System.out.println("\nKunde: " + name);
        System.out.println("Adresse: " + adresse);
        System.out.println("Kundennummer: " + nummer);
        System.out.println("Marge: " + marge);
    }

    public double getMarge() {
        return marge;
    }

    public void setMarge(double marge) {
        this.marge = marge;
    }

    public int getNummer() {
        return nummer;
    }
}
