package sw8;

public class Privatkudne extends Kunde {
    public Privatkudne(String name, String adresse, int nummer) {
        super(name, adresse, nummer);
        super.setMarge(2.5);
    }
}
