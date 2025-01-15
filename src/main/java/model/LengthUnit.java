package model;
import model.enums.LengthConversionOption;

import java.util.Scanner;
import static controller.MenuController.getValidDouble;
import static controller.MenuController.getValidInt;

public class LengthUnit extends Unit {
    @Override
    public void convert(Scanner scanner) {
        System.out.println("\nLength Conversion:");
        for (LengthConversionOption option : LengthConversionOption.values()) {
            System.out.println(option.ordinal() + 1 + ". " + option);
        }
        System.out.print("Choose an option: ");
        int option = getValidInt(scanner) - 1;
        System.out.print("Enter the value to convert: ");
        double value = getValidDouble(scanner);

        LengthConversionOption selectedOption = LengthConversionOption.values()[option];

        switch (selectedOption) {
            case KILOMETERS_TO_METERS:
                System.out.println(value + " kilometers is " + (value * 1000) + " meters.\n");
                break;
            case METERS_TO_KILOMETERS:
                System.out.println(value + " meters is " + (value / 1000) + " kilometers.\n");
                break;
            case INCHES_TO_FEET:
                System.out.println(value + " inches is " + (value / 12) + " feet.\n");
                break;
            case FEET_TO_INCHES:
                System.out.println(value + " feet is " + (value * 12) + " inches.\n");
                break;
            default:
                System.out.println("Invalid option.\n");
        }
    }
}