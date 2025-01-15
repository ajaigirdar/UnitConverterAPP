import controller.MenuController;

public class App {
    public static MenuController menuController = new MenuController();

    public static void main(String[] args) {
        boolean run = true;
        while (run){
            menuController.displayMenu();
            int choice = menuController.getChoice();

            switch (choice) {
                case 1:
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 5:
                    run = false;
                    System.out.println("Exiting the Unit Converter App. Goodbye");
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }



}
