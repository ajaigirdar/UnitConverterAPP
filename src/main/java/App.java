import controller.MenuController;

public class App {
    public static MenuController menuController = new MenuController();

    public static void main(String[] args) {
        boolean run = true;
        while (run){
            menuController.displayMenu();
            int choice = menuController.getChoice();

        }

    }

}
