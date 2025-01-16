package model;
import controller.MenuController;
import model.enums.AreaConversionOption;
import model.enums.WeightConversionOption;

import java.util.Scanner;
import static controller.MenuController.getValidDouble;
import static controller.MenuController.getValidInt;

public class AreaUnit extends Unit{
    public void convert(Scanner scanner) {

        System.out.print("Choose an option: ");
        for (AreaConversionOption option: AreaConversionOption.values()){
            System.out.println(option.ordinal() + 1 + ". " + option);
        }
        System.out.println("Choose an option: ");
        int option = getValidInt(scanner) - 1;
        System.out.println("Enter the value to convert: ");
        double value = getValidDouble(scanner);

        AreaConversionOption selectedOption = AreaConversionOption.values()[option];

        switch (selectedOption) {
            case SQUARE_METERS_TO_SQUARE_KILOMETERS -> System.out.println(value + " square meters is " + (value / 1_000_000) + " square kilometers.\n");
            case SQUARE_KILOMETERS_TO_SQUARE_METERS -> System.out.println(value + " square kilometers is " + (value * 1_000_000) + " square meters.\n");
            case ACRES_TO_HECTARES -> System.out.println(value + " acres is " + (value * 0.404686) + " hectares.\n");
            case HECTARES_TO_ACRES -> System.out.println(value + " hectares is " + (value / 0.404686) + " acres.\n");
            default -> System.out.println("Invalid option.\n");
        }
    }
}
