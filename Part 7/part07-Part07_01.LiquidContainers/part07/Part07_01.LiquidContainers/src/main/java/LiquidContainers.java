
import java.util.Scanner;

public class LiquidContainers {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int containerOne = 0;
        int containerTwo = 0;

        while (true) {
            System.out.println("First: " + containerOne + "/100");
            System.out.println("Second: " + containerTwo + "/100");

            String input = scan.nextLine();

            if (input.equals("quit")) {
                break;
            }

            String[] parts = input.split(" ");
            String command = parts[0];
            int amount = Integer.valueOf(parts[1]);

            if (command.equals("add")) {
                if (containerOne + amount >= 100) {
                    containerOne = 100;
                } else if (amount <= 0) {
                    containerOne += 0;
                } else {
                    containerOne += amount;
                }
            }

            if (command.equals("move")) {
                if (containerTwo + amount >= 100) {
                    containerTwo = 100;
                    containerOne -= amount;
                } else if (amount <= 0) {
                    containerTwo += 0;
                } else if (containerOne - amount < 0) {
                    containerTwo += containerOne;
                    containerOne = 0;
                } else {
                    containerTwo += amount;
                    containerOne -= amount;
                    if (containerOne < 0) {
                        containerOne = 0;
                    }
                }
            }

            if (command.equals("remove")) {
                if (containerTwo - amount < 0) {
                    containerTwo = 0;
                } else {
                    containerTwo -= amount;
                }
            }

            System.out.println();
        }
    }
}
