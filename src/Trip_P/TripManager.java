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

            try {
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
            } catch (InputMismatchException e) {
                System.out.println("-------------------------------");
                System.out.println("Invalid input type, try again...");
                System.out.println("-------------------------------");
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
