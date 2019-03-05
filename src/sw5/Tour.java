package sw5;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Tour {
    private String ziel;
    private String datum = "1.1.2019";

    public Tour(String ziel){
        this.ziel = ziel;
        setDatum(getTodaysDate());
    }

    private String getTodaysDate(){
        long timeMillis = System.currentTimeMillis();
        Date currentDate = new Date(timeMillis);
        SimpleDateFormat fDate = new SimpleDateFormat("dd.MM.yyyy");
        return fDate.format(currentDate);
    }


    public String getZiel() {
        return ziel;
    }

    public String getDatum() {
        return datum;
    }

    public void setDatum(String datum) {
        this.datum = datum;
    }

    public void print(){
        System.out.println("Tour vom: " + getDatum());
        System.out.println("Ziel: " + getZiel());
    }
}
