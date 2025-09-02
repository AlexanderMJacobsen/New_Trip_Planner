package Main_P;
import Tools.Util;
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
                        TripManager.createTrip();
                        break;
                    case 2:
                        System.out.println();
                        System.out.println("------------------------");
                        System.out.println("------Viewing Trips-----");
                        System.out.println("------------------------");
                        TripManager.viewTrips();
                        break;
                    case 3:
                        System.out.println();
                        System.out.println("------------------------");
                        System.out.println("-----Editing Trips------");
                        System.out.println("------------------------");
                        TripManager.viewTrips();
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
}
