package model;

import controller.MenuController;

import java.util.Scanner;

import static controller.MenuController.getValidDouble;

public class WeightUnit extends Unit{

    @Override
    public void convert(Scanner scanner) {
        System.out.println("\nWeight Conversion:");
        System.out.println("1. Grams to Kilograms");
        System.out.println("2. Kilograms to Grams");
        System.out.println("3. Pounds to Ounces");
        System.out.println("4. Ounces to Pounds");
        System.out.print("Choose an option: ");
        int option = MenuController.getValidInt(scanner);
        System.out.println("Enter the value to convert: ");
        double value = getValidDouble(scanner);

        switch (option) {
            case 1:
                System.out.println(value + " grams is " + (value / 1000) + " kilograms.\n");
                break;
            case 2:
                System.out.println(value + " kilograms is " + (value * 1000) + " grams.\n");
                break;
            case 3:
                System.out.println(value + " pounds is " + (value * 16) + " ounces.\n");
                break;
            case 4:
                System.out.println(value + " ounces is " + (value / 16) + " pounds.\n");
                break;
            default:
                System.out.println("Invalid option.\n");
        }
    }
}
