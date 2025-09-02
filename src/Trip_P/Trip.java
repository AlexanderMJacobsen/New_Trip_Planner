package Trip_P;

public class Trip {

    String country;
    int duration;
    boolean hotel;
    boolean flight;

    public Trip (String country, int duration, boolean hotel, boolean flight) {
        this.country = country;
        this.duration = duration;
        this.hotel = hotel;
        this.flight = flight;

    }

    public String getCountry() {
        return this.country;
    }
    public String setCountry(String country) {
        return this.country = country;
    }
    public int getDuration() {
        return this.duration;
    }
    public int setDuration(int duration) {
        return this.duration = duration;
    }
    public boolean getHotel() {
        return this.hotel;
    }
    public boolean setHotel(boolean hotel) {
        return this.hotel = hotel;
    }
    public boolean getFlight() {
        return this.flight;
    }
    public boolean setFlight(boolean flight) {
        return this.flight = flight;
    }

    public String toString(){
        return
        "Country   : " + this.country + "\n" +
        "Duration  : " + this.duration + " days\n" +
        "Hotel     : " + this.hotel + "\n" +
        "Flight   : " + this.flight;



    }

}
