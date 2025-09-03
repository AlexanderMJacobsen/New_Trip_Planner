package Trip_P;

public class SkiTrip extends Trip {

    boolean warmDrinks;
    boolean isRentingEquipment;

    public SkiTrip (int tripID, String country, int duration, boolean hotel, boolean flight, boolean warmDrinks, boolean isRentingEquipment) {
        super(tripID, country, duration, hotel, flight);
        this.warmDrinks = warmDrinks;
        this.isRentingEquipment = isRentingEquipment;

    }

    public boolean getWarmDrink() {
        return this.warmDrinks;
    }
    public boolean setWarmDrink(boolean warmDrinks) {
        return this.warmDrinks = warmDrinks;
    }
    public boolean getRentingEquipment() {
        return this.isRentingEquipment;
    }
    public boolean setRentingEquipment(boolean isRentingEquipment) {
        return this.isRentingEquipment = isRentingEquipment;
    }

    public String toString(){
       return super.toString() +
        "Warm Drinks: " + this.warmDrinks + "\n" +
        "Renting Ski Equipment: " + this.isRentingEquipment;

    }

}
