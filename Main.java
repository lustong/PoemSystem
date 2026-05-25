public class Main {
    public static void main(String[] args) {
        PoemService service = new PoemService();
        ConsoleUI ui = new ConsoleUI(service);

        User loginUser = ui.loginScreen();
        if (loginUser != null) {
            ui.mainMenu(loginUser);
        }
    }
}