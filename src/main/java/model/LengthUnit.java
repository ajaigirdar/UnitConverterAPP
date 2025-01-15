package model;
import java.util.Scanner;
import static controller.MenuController.getValidDouble;
import static controller.MenuController.getValidInt;

public class LengthUnit extends Unit {
    @Override
    public void convert(Scanner scanner) {
        System.out.println("-- Length Conversion Menu --");
        System.out.println("1 - Kilometers to Meters");
        System.out.println("2 - Meters to Kilometers");
        System.out.println("3 - Inches to Feet");
        System.out.println("4 - Feet to Inches");
        System.out.print("Choose an option: ");

        int option = getValidInt(scanner);
        System.out.print("Enter the value to convert: ");
        double value = getValidDouble(scanner);

        switch (option) {
            case 1:
                System.out.println(value + " kilometers is " + (value * 1000) + " meters.\n");
                break;
            case 2:
                System.out.println(value + " meters is " + (value / 1000) + " kilometers.\n");
                break;
            case 3:
                System.out.println(value + " inches is " + (value / 12) + " feet.\n");
                break;
            case 4:
                System.out.println(value + " feet is " + (value * 12) + " inches.\n");
                break;
            default:
                System.out.println("Invalid option.\n");
        }
    }
}