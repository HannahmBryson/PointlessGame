public class Main {

        private final UI ui = new UI();

        private void testUI() {
            String command;
            do {
                command = ui.getCommand();
                ui.displayString(command);
                ui.display();
            } while (!command.equals("quit"));
        }

        public static void main(String[] args) {
            Main game = new Main();
            game.testUI();
            System.exit(0);
        }
}
