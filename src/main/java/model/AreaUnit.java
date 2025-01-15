package model;
import controller.MenuController;
import java.util.Scanner;
import static controller.MenuController.getValidDouble;

public class AreaUnit extends Unit{
    public void convert(Scanner scanner) {
        System.out.println("1. Square Meters to Square Kilometers");
        System.out.println("2. Square Kilometers to Square Meters");
        System.out.println("3. Acres to Hectares");
        System.out.println("4. Hectares to Acres");
        System.out.print("Choose an option: ");

        int option = MenuController.getValidInt(scanner);
        System.out.println("Enter the value to convert: ");
        double value = getValidDouble(scanner);

        switch (option) {
            case 1:
                System.out.println(value + " square meters is " + (value / 1_000_000) + " square kilometers.\n");
                break;
            case 2:
                System.out.println(value + " square kilometers is " + (value * 1_000_000) + " square meters.\n");
                break;
            case 3:
                System.out.println(value + " acres is " + (value * 0.404686) + " hectares.\n");
                break;
            case 4:
                System.out.println(value + " hectares is " + (value / 0.404686) + " acres.\n");
                break;
            default:
                System.out.println("Invalid option.\n");
        }
    }
}
