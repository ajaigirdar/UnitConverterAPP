package controller;

import model.*;

import java.util.Scanner;

public class MenuController {
    public void displayMenu() {
        Scanner scanner = new Scanner(System.in);
        boolean keepRunning = true;

        while (keepRunning) {
            System.out.println("Welcome to Unit Converter App!\n");
            System.out.println("Choose a conversion category:");
            System.out.println("1. Length");
            System.out.println("2. Temperature");
            System.out.println("3. Weight");
            System.out.println("4. Area");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");

            int choice = getValidInt(scanner);
            Unit unit;

            switch (choice) {
                case 1:
                    unit = new LengthUnit();
                    unit.convert(scanner);
                    break;
                case 2:
                    break;
                case 3:

                    break;
                case 4:
                    break;
                case 5:
                    keepRunning = false;
                    System.out.println("Thank you for using the Unit Converter App!");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }

        scanner.close();
    }

    public static int getValidInt(Scanner scanner) {
        while (true) {
            try {
                return scanner.nextInt();
            } catch (Exception e) {
                System.out.print("Invalid input. Please enter a valid integer: ");
                scanner.next(); // Clear the invalid input
            }
        }
    }

    public static double getValidDouble(Scanner scanner) {
        while (true) {
            try {
                return scanner.nextDouble();
            } catch (Exception e) {
                System.out.print("Invalid input. Please enter a valid number: ");
                scanner.next(); // Clear the invalid input
            }
        }
    }
}
