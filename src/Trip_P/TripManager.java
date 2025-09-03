package Trip_P;

import Main_P.UI;
import Tools.Util;

import java.io.IOException;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class TripManager {

    static ArrayList<Trip> trips = new ArrayList<>();


    public static void tripLoad() throws IOException  {

    }

    public static void createStandardTrip() {
        System.out.println("Country Enter (String) : ");
        String country = Util.stringScan();
        System.out.println("Duration Enter (int) : ");
        int duration = Util.intScan();
        System.out.println("Hotel stay Enter (True||False)  : ");
        boolean hotel = Util.booleanScan();
        System.out.println("Flight Enter (True||False)  : ");
        boolean flight = Util.booleanScan();
        trips.add(new Trip(country, duration, hotel, flight));
        System.out.println("Successfully created a Trip");
    }
    public static void createSkiTrip() {
        System.out.println("Country Enter (String) : ");
        String country = Util.stringScan();
        System.out.println("Duration Enter (int) : ");
        int duration = Util.intScan();
        System.out.println("Hotel stay Enter (True||False)  : ");
        boolean hotel = Util.booleanScan();
        System.out.println("Flight Enter (True||False)  : ");
        boolean flight = Util.booleanScan();
        System.out.println("Warm Drinks Enter (True||False)  : ");
        boolean warmDrink = Util.booleanScan();
        System.out.println("Rent Ski Equipment Enter (True||False)  : ");
        boolean skiEquipment = Util.booleanScan();
        trips.add(new SkiTrip(country, duration, hotel, flight, warmDrink, skiEquipment));
        System.out.println("Successfully created a SkiTrip");

    }
    public static void createBeachTrip() {
        System.out.println("Country Enter (String) : ");
        String country = Util.stringScan();
        System.out.println("Duration Enter (int) : ");
        int duration = Util.intScan();
        System.out.println("Hotel stay Enter (True||False)  : ");
        boolean hotel = Util.booleanScan();
        System.out.println("Flight Enter (True||False)  : ");
        boolean flight = Util.booleanScan();
        System.out.println("Swimp Equipment Enter (True||False)  : ");
        boolean swimEquipment = Util.booleanScan();
        System.out.println("Sunscreen Enter (True||False)  : ");
        boolean sunscreen = Util.booleanScan();
        trips.add(new BeachTrip(country, duration, hotel, flight, swimEquipment, sunscreen));
        System.out.println("Successfully created a BeachTrip");
    }

    public static void viewTrips() {
        for (Trip trip : trips) {
            System.out.println();
            System.out.println("------------------------");
            System.out.println(trip);
            System.out.println("------------------------");
        }
        System.out.println();

    }

}
