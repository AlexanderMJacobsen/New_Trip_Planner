package Trip_P;

public class BeachTrip extends Trip {

    boolean isBeachTrip;
    boolean swimEquipment;
    boolean sunscreen;

    public BeachTrip(String country, int duration, boolean hotel, boolean flight, boolean isBeachTrip, boolean swimEquipment, boolean sunscreen) {
        super(country,duration,hotel, flight);
        this.isBeachTrip = isBeachTrip;
        this.swimEquipment = swimEquipment;
        this.sunscreen = sunscreen;
    }
}
