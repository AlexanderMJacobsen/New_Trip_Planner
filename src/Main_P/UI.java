package Main_P;
import Tools.Util;
import Trip_P.BeachTrip;
import Trip_P.SkiTrip;
import Trip_P.Trip;
import Trip_P.TripManager;

import java.io.IOException;
import java.util.InputMismatchException;


public class UI {


    public static void startMenu() {

        boolean runCheck = true;

        while (runCheck) {
            System.out.println("-------------------------------");
            System.out.println("----------Welcome-To-The-------");
            System.out.println("-----------Trip-Planner--------");
            System.out.println("-------------------------------");
            System.out.println("Enter 1 to create a new Trip");
            System.out.println("Enter 2 to view all Trips");
            System.out.println("Enter 3 to edit a Trip");
            System.out.println("Enter 4 to exit");
            System.out.println("-------------------------------");
            try {
                int switchCheck = Util.intScan();

                switch (switchCheck) {
                    case 1:
                        System.out.println();
                        System.out.println("------------------------");
                        System.out.println("------Creating Trip-----");
                        System.out.println("------------------------");
                        createTrip();
                        break;
                    case 2:
                        System.out.println();
                        System.out.println("------------------------");
                        System.out.println("------Viewing Trips-----");
                        System.out.println("------------------------");
                        System.out.println();
                        tripViewer();
                        break;
                    case 3:
                        System.out.println();
                        System.out.println("------------------------");
                        System.out.println("-----Editing Trips------");
                        System.out.println("------------------------");
                        System.out.println();
                        tripEditor();
                        break;
                    case 4:
                        System.out.println("Exiting, thank you for using the Travel Planner");
                        runCheck = false;
                        break;
                    default:
                        System.out.println();
                        System.out.println("------------------------");
                        System.out.println("Please enter a valid int");
                        System.out.println("------------------------");
                        System.out.println();
                }

            } catch (InputMismatchException e) {
                System.out.println();
                System.out.println("-------------------");
                System.out.println("Please enter an int");
                System.out.println("-------------------");
                System.out.println();
            }


        }

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
                        TripManager.createStandardTrip();
                        tryToCreateTrip = false;
                        break;
                    case 2:
                        TripManager.createBeachTrip();
                        tryToCreateTrip = false;
                        break;

                    case 3:
                        TripManager.createSkiTrip();
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
    }
    public static void tripViewer() {
        if (TripManager.trips.isEmpty()) {
            System.out.println("-------------------------------");
            System.out.println("There is currently no trips");
            System.out.println("-------------------------------");
            System.out.println();
        }
        else {
            TripManager.viewTrips();
        }
    }
    public static void tripEditor() {

        if (TripManager.trips.isEmpty()) {
            System.out.println("-------------------------------");
            System.out.println("There is currently no trips");
            System.out.println("-------------------------------");
            System.out.println();
        }
        else {
            TripManager.viewTrips();
            System.out.println("Enter ID of trip you want to Edit");
            System.out.println("-------------------------------");
            TripManager.editTrips();
        }
    }
}
