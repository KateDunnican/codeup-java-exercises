package util;
import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;
public class Input {

    private static Scanner scanner;

        public Input (){ //constructor
            scanner = new Scanner(System.in);
        }

        public String getString(){
            System.out.println("Type something:");
            String scannerInput = scanner.nextLine();
            System.out.println("You said: " + scannerInput);
            return scannerInput;
        }

        public boolean yesNo(){
            System.out.println("Type yes or no:");
            String scannerInput = scanner.nextLine();
            if (scannerInput.toLowerCase().contains("y")){
                System.out.println("true");
                return true;
            }
            else {
                System.out.println("false");
                return false;
            }
        }

        public int getInt(int min, int max){
            System.out.println("Type in a number between " + min + " and " + max + ":");
            int scannerInt = scanner.nextInt();

            while ((scannerInt > max) || (scannerInt < min)){
                System.out.println("Try again:");
                scannerInt = scanner.nextInt();
            }

            System.out.println("Good job! You entered: " + scannerInt);
            return scannerInt;
        }

        public int getInt(){
            System.out.println("Type in a number (again):");
            int scannerInt = scanner.nextInt();
            System.out.println("Good job! You entered: " + scannerInt);
            return scannerInt;
        }

        public double getDouble(double min, double max){
            System.out.println("Type in a number between " + min + " and " + max + ":");
            double scannerDouble = scanner.nextDouble();

            while ((scannerDouble > max) || (scannerDouble < min)){
                System.out.println("Try again:");
                scannerDouble = scanner.nextDouble();
            }

            System.out.println("Good job! You entered: " + scannerDouble);
            return scannerDouble;
        }

        public double getDouble(){
            System.out.println("Type in a number (again):");
            double scannerDouble = scanner.nextDouble();
            System.out.println("Good job! You entered: " + scannerDouble);
            return scannerDouble;
        }
}
