package Trip_P;

import Main_P.UI;
import Tools.Util;

import java.io.IOException;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class TripManager {

    public static ArrayList<Trip> trips = new ArrayList<>();


    public static void tripLoad() throws IOException  {

    }

    public static int idTripCreator() {
        int newID = 0;
        for (Trip trip : trips) {
                newID++;
            if (trip.tripID == newID) {
                newID++;
            }
        }
        return newID;
    }

    public static void createStandardTrip() {
        int newTripID = idTripCreator();
        System.out.println("Country Enter (String): ");
        String country = Util.stringScan();
        System.out.println("Duration Enter (int): ");
        int duration = Util.intScan();
        System.out.println("Hotel stay Enter (True||False): ");
        boolean hotel = Util.booleanScan();
        System.out.println("Flight Enter (True||False): ");
        boolean flight = Util.booleanScan();
        trips.add(new Trip(newTripID, country, duration, hotel, flight));
        System.out.println("Successfully created a Trip");
    }
    public static void createSkiTrip() {
        int newTripID = idTripCreator();
        System.out.println("Country Enter (String): ");
        String country = Util.stringScan();
        System.out.println("Duration Enter (int): ");
        int duration = Util.intScan();
        System.out.println("Hotel stay Enter (True||False): ");
        boolean hotel = Util.booleanScan();
        System.out.println("Flight Enter (True||False): ");
        boolean flight = Util.booleanScan();
        System.out.println("Warm Drinks Enter (True||False): ");
        boolean warmDrink = Util.booleanScan();
        System.out.println("Rent Ski Equipment Enter (True||False): ");
        boolean skiEquipment = Util.booleanScan();
        trips.add(new SkiTrip(newTripID, country, duration, hotel, flight, warmDrink, skiEquipment));
        System.out.println("Successfully created a SkiTrip");

    }
    public static void createBeachTrip() {
        int newTripID = idTripCreator();
        System.out.println("Country Enter (String): ");
        String country = Util.stringScan();
        System.out.println("Duration Enter (int): ");
        int duration = Util.intScan();
        System.out.println("Hotel stay Enter (True||False): ");
        boolean hotel = Util.booleanScan();
        System.out.println("Flight Enter (True||False): ");
        boolean flight = Util.booleanScan();
        System.out.println("Swimp Equipment Enter (True||False): ");
        boolean swimEquipment = Util.booleanScan();
        System.out.println("Sunscreen Enter (True||False): ");
        boolean sunscreen = Util.booleanScan();
        trips.add(new BeachTrip(newTripID, country, duration, hotel, flight, swimEquipment, sunscreen));
        System.out.println("Successfully created a BeachTrip");
    }

    public static void viewTrips() {

            for (Trip trip : trips) {
                System.out.println();
                System.out.println("------------------------");
                System.out.println(trip);
                System.out.println("------------------------");
                System.out.println();
            }

    }

    public static void editTrips() {

        int id = Util.intScan();

        for (Trip trip : trips) {
            if (trip.tripID == id) {
                if (trip instanceof SkiTrip) {
                    System.out.println("Set new country (string):");
                    trip.setCountry(Util.stringScan());
                    System.out.println("Set new duration (int):");
                    trip.setDuration(Util.intScan());
                    System.out.println("Set new Hotel (True||False):");
                    trip.setHotel(Util.booleanScan());
                    System.out.println("Set new Flight (True||False):");
                    trip.setFlight(Util.booleanScan());
                    System.out.println("Set new Warm Drinks (True||False)");
                    ((SkiTrip) trip).setWarmDrink((Util.booleanScan()));
                    ((SkiTrip) trip).setRentingEquipment((Util.booleanScan()));
                } else if (trip instanceof BeachTrip) {
                    System.out.println("Set new country (string):");
                    trip.setCountry(Util.stringScan());
                    System.out.println("Set new duration (int):");
                    trip.setDuration(Util.intScan());
                    System.out.println("Set new Hotel (True||False):");
                    trip.setHotel(Util.booleanScan());
                    System.out.println("Set new Flight (True||False):");
                    trip.setFlight(Util.booleanScan());
                    System.out.println("Set new Swim Equipment (True||False):");
                    ((BeachTrip) trip).setSwimEquipment((Util.booleanScan()));
                    System.out.println("Set new sunScreen (True||False):");
                    ((BeachTrip) trip).setSunscreen((Util.booleanScan()));
                }
                else {
                    System.out.println("Set new country (string):");
                    trip.setCountry(Util.stringScan());
                    System.out.println("Set new duration (int):");
                    trip.setDuration(Util.intScan());
                    System.out.println("Set new Hotel (True||False):");
                    trip.setHotel(Util.booleanScan());
                    System.out.println("Set new Flight (True||False):");
                    trip.setFlight(Util.booleanScan());
                }
//boolean swimEquipment, boolean sunscreen,  boolean warmDrinks, boolean isRentingEquipment
            }
        }

    }

}
