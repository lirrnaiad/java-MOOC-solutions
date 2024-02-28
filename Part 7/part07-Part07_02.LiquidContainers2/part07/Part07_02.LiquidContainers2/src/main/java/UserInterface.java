import java.util.Scanner;

public class UserInterface {
    private Container containerOne;
    private Container containerTwo;
    private Scanner scanner;

    public UserInterface(Container container1, Container container2, Scanner scanner) {
        this.containerOne = container1;
        this.containerTwo = container2;
        this.scanner = scanner;
    }

    public void start() {
        while (true) {
            System.out.println("First: " + containerOne.contains() + "/100");
            System.out.println("Second: " + containerTwo.contains() + "/100");

            String input = scanner.nextLine();

            if (input.equals("quit")) {
                break;
            }

            String[] parts = input.split(" ");
            String command = parts[0];
            int amount = Integer.valueOf(parts[1]);

            if (command.equals("add")) {
                containerOne.add(amount);
            } else if (command.equals("move")) {
                if (amount <= 0) {
                    containerTwo.add(0);
                } else if (amount > containerOne.contains()) {
                    containerTwo.add(containerOne.contains());
                    containerOne.remove(100);
                } else {
                    containerTwo.add(amount);
                    containerOne.remove(amount);
                }
            } else if (command.equals("remove")) {
                containerTwo.remove(amount);
            }

            System.out.println();
        }
    }
}
