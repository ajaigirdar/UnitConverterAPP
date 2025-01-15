package model;
import controller.MenuController;
import java.util.Scanner;

public class TemperatureUnit extends Unit {

    @Override
    public void convert(Scanner scanner) {
        System.out.println("\nTemperature Conversion:");
        System.out.println("1. Celsius to Fahrenheit");
        System.out.println("2. Fahrenheit to Celsius");
        System.out.println("3. Celsius to Kelvin");
        System.out.println("3. Kelvin to Celsius");
        System.out.print("Choose an option: ");

        int option = MenuController.getValidInt(scanner);
        System.out.print("Enter the value to convert: ");
        double value = MenuController.getValidDouble(scanner);

        switch (option) {
            case 1:
                System.out.println(value + " Celsius is " + ((value * 9 / 5) + 32) + " Fahrenheit.\n");
                break;
            case 2:
                System.out.println(value + " Fahrenheit is " + ((value - 32) * 5 / 9) + " Celsius.\n");
                break;
            case 3:
                System.out.println(value + " Celsius is " + (value + 273.15) + " Kelvin.\n");
                break;
            case 4:
                System.out.println(value + " Kelvin is " + (value - 273) + " Celsius.\n");
                break;
            default:
                System.out.println("Invalid option.\n");
        }
    }
}