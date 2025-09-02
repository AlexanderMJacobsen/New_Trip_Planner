package Tools;

import java.io.File;
import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Util {


    public static int intScan() throws InputMismatchException {
        Scanner scan = new Scanner(System.in);
        return scan.nextInt();
    }
    public static String stringScan() throws InputMismatchException {
        Scanner scan = new Scanner(System.in);
        return scan.next();
    }
    public static boolean booleanScan() throws InputMismatchException {
        Scanner scan = new Scanner(System.in);
        return scan.nextBoolean();
    }

    public static Scanner scanFile(String filePath) throws IOException {
        File file = new File(filePath);
        return new Scanner(file);
    }

}
