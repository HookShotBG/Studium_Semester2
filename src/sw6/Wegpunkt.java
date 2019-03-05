package sw6;

public class Wegpunkt {
    private double hoehe;
    private long zeit;

    public Wegpunkt(double hoehe){
        this.hoehe = hoehe;
        zeit = System.currentTimeMillis();
    }

    public double getHoehe() {
        return hoehe;
    }

    public void setHoehe(double hoehe) {
        this.hoehe = hoehe;
    }

    public long getZeit() {
        return zeit;
    }

    public void setZeit(long zeit) {
        this.zeit = zeit;
    }
}
