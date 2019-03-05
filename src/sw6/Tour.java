package sw6;

import java.text.SimpleDateFormat;
import java.time.Period;
import java.util.ArrayList;
import java.util.Date;

public class Tour {
    private String ziel;
    private String datum = "1.1.2019";
    private ArrayList<Wegpunkt> wegpunkte;

    public Tour(String ziel){
        this.ziel = ziel;
        setDatum(getTodaysDate());
        wegpunkte = new ArrayList<>();
    }

    private String getTodaysDate(){
        long timeMillis = System.currentTimeMillis();
        Date currentDate = new Date(timeMillis);
        SimpleDateFormat fDate = new SimpleDateFormat("dd.MM.yyyy");
        return fDate.format(currentDate);
    }

    private String convertTime(long timeMillis){
        Date currentDate = new Date(timeMillis);
        SimpleDateFormat fTime = new SimpleDateFormat("HH:mm:ss");
        return fTime.format(currentDate);
    }

    private String convertTime(long timeMillis, long tm){
        Date currentDate = new Date(timeMillis);
        Date adjDate = new Date(tm);
        long diff = currentDate.getTime()-adjDate.getTime();
        long diffSeconds = diff / 1000 % 60;
        long diffMinutes = diff / (60 * 1000) % 60;
        long diffHours = diff / (60 * 60 * 1000);
        return diffHours + " h, " + diffMinutes + " min, " + diffSeconds + " sec ";
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

    public void saveWegpunkt(double hoehe){
        wegpunkte.add(new Wegpunkt(hoehe));
    }

    public void print(){
        System.out.println("Tour vom: " + getDatum());
        System.out.println("Ziel: " + getZiel());
        //foreach
        for (Wegpunkt elem : wegpunkte) {
            System.out.println("Zeit: " + convertTime(elem.getZeit()) + " Höhe: " + elem.getHoehe());
        }
        teilstrecke();
    }

    public void teilstrecke(){
        System.out.println("Teilstrecken");
        for (int i=1; i<wegpunkte.size();i++){
            Wegpunkt wayp = wegpunkte.get(i-1);
            Wegpunkt waypoint = wegpunkte.get(i);
            convertTime(waypoint.getZeit(), wayp.getZeit());
            System.out.println("Zeit "+ convertTime(waypoint.getZeit(), wayp.getZeit()) +  " Höhendifferenz: " + (waypoint.getHoehe() - wayp.getHoehe()));
        }

    }

}
