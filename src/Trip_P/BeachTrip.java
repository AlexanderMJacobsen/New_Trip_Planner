package Trip_P;

public class BeachTrip extends Trip {

    boolean swimEquipment;
    boolean sunscreen;

    public BeachTrip(String country, int duration, boolean hotel, boolean flight, boolean swimEquipment, boolean sunscreen) {
        super(country,duration,hotel, flight);
        this.swimEquipment = swimEquipment;
        this.sunscreen = sunscreen;
    }

    public boolean getSwimEquipment(){
        return this.swimEquipment;
    }
    public boolean setSwimEquipment(boolean swimEquipment) {
        return this.swimEquipment = swimEquipment;
    }

    public boolean getSunscreen() {
        return this.sunscreen;
    }

    public boolean setSunscreen(boolean sunscreen) {
        return this.sunscreen = sunscreen;
    }

    public String toString() {
        return super.toString() + "\n" +
        "Swim Equipment: " + this.swimEquipment + "\n" +
        "Sunscreen: " + this.sunscreen;

    }

}
