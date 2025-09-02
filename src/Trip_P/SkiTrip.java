package Trip_P;

public class SkiTrip extends Trip {

    boolean isSkipTrip;
    boolean isRentingEquipment;

    public SkiTrip (String country, int duration, boolean hotel, boolean flight, boolean isSkipTrip, boolean isRentingEquipment) {
        super(country, duration, hotel, flight);
        this.isSkipTrip = isSkipTrip;
        this.isRentingEquipment = isRentingEquipment;

    }

    public boolean getSkipTrip() {
        return this.isSkipTrip;
    }
    public boolean setSkiTrip(boolean isSkipTrip) {
        return this.isSkipTrip = isSkipTrip;
    }
    public boolean getRentingEquipment() {
        return this.isRentingEquipment;
    }
    public boolean setRentingEquipment(boolean isRentingEquipment) {
        return this.isRentingEquipment = isRentingEquipment;
    }

    public String toString(){
       return super.toString() +
        "SkiTrip   : " + this.isSkipTrip + "\n" +
        "Renting Equipment   : " + this.isRentingEquipment + "\n";

    }

}
