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

    public static void createTrip() throws InputMismatchException {

        boolean tryToCreateTrip = true;

        while (tryToCreateTrip) {

            System.out.println("Please choose what type of Trip you would like");
            System.out.println("Enter 1 for a Standard Trip");
            System.out.println("Enter 2 for a Beach Trip");
            System.out.println("Enter 3 for a Ski Trip");
            System.out.println("Enter 4 to go back to Main Menu");

            try {
                int switchNav = Util.intScan();
                switch (switchNav) {
                    case 1:
                        System.out.println("Country Enter (String) : ");
                        String country = Util.stringScan();
                        System.out.println("Duration Enter (int) : ");
                        int duration = Util.intScan();
                        System.out.println("Hotel stay Enter (True||False)  : ");
                        boolean hotel = Util.booleanScan();
                        System.out.println("Flight Enter (True||False)  : ");
                        boolean flight = Util.booleanScan();
                        trips.add(new Trip(country, duration, hotel, flight));
                        tryToCreateTrip = false;
                        break;
                    case 2:
                        System.out.println("Country Enter (String) : ");
                        country = Util.stringScan();
                        System.out.println("Duration Enter (int) : ");
                        duration = Util.intScan();
                        System.out.println("Hotel stay Enter (True||False)  : ");
                        hotel = Util.booleanScan();
                        System.out.println("Flight Enter (True||False)  : ");
                        flight = Util.booleanScan();
                        System.out.println("Swimp Equipment Enter (True||False)  : ");
                        boolean swimEquipment = Util.booleanScan();
                        System.out.println("Sunscreen Enter (True||False)  : ");
                        boolean sunscreen = Util.booleanScan();
                        trips.add(new BeachTrip(country, duration, hotel, flight, swimEquipment, sunscreen));
                        tryToCreateTrip = false;
                        break;

                    case 3:
                        System.out.println("Country Enter (String) : ");
                        country = Util.stringScan();
                        System.out.println("Duration Enter (int) : ");
                        duration = Util.intScan();
                        System.out.println("Hotel stay Enter (True||False)  : ");
                        hotel = Util.booleanScan();
                        System.out.println("Flight Enter (True||False)  : ");
                        flight = Util.booleanScan();
                        System.out.println("Warm Drinks Enter (True||False)  : ");
                        boolean warmDrink = Util.booleanScan();
                        System.out.println("Rent Ski Equipment Enter (True||False)  : ");
                        boolean skiEquipment = Util.booleanScan();
                        trips.add(new SkiTrip(country, duration, hotel, flight, warmDrink, skiEquipment));
                        tryToCreateTrip = false;
                        break;

                    case 4:
                        tryToCreateTrip = false;
                        break;

                    default:
                        tryToCreateTrip = false;
                        System.out.println();
                        System.out.println("------------------------");
                        System.out.println("Please enter a valid int");
                        System.out.println("------------------------");
                        System.out.println();
                        createTrip();
                }
            } catch (InputMismatchException e) {
                System.out.println("-------------------------------");
                System.out.println("Invalid input type, try again...");
                System.out.println("-------------------------------");
                tryToCreateTrip = false;
                createTrip();
            }
        }
        System.out.println();
        System.out.println("-------------------------------");
        System.out.println("Successfully created Trip");
        System.out.println("Returning to Menu");
        System.out.println("-------------------------------");
        System.out.println();
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
