package controller;

import java.util.Scanner;

public class MenuController {
    private Scanner scanner = new Scanner(System.in);
    public void displayMenu() {
        System.out.println("-[ Unit Converter App Menu ]-");
        System.out.println(" 1 - Convert Length");
        System.out.println(" 2 - Convert Temperature");
        System.out.println(" 3 - Convert Weight");
        System.out.println(" 4 - Convert Area");
        System.out.println(" 5 - Exit");
        System.out.print("Please enter your choice (1 to 5): ");
    }

    public int getChoice() {
        return scanner.nextInt();
    }
}
