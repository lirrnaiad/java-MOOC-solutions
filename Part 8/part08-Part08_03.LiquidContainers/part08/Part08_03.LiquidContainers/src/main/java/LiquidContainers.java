
import java.util.Scanner;

public class LiquidContainers {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int containerOne = 0;
        int containerTwo = 0;
        while (true) {
            System.out.println("First: " + containerOne + "/100");
            System.out.println("Second: " + containerTwo + "/100");
            System.out.print("> ");

            String input = scan.nextLine();
            if (input.equals("quit")) {
                break;
            }

            String[] parts = input.split(" ");
            String command = parts[0];
            int value = Integer.valueOf(parts[1]);

            if (command.equals("add")) {
                if (value < 0) {
                    System.out.println();
                    continue;
                }

                if (containerOne + value > 100) {
                    containerOne = 100;
                } else {
                    containerOne += value;
                }
            }

            if (command.equals("move")) {
                if (value < 0) {
                    System.out.println();
                    continue;
                }

                if (value > containerOne) {
                    containerTwo += containerOne;
                    containerOne = 0;
                    System.out.println();
                    continue;
                }

                if (containerTwo + value > 100) {
                    containerTwo = 100;
                    if (containerOne - value < 0) {
                        containerOne = 0;
                    } else {
                        containerOne -= value;
                    }
                } else {
                    containerTwo += value;
                    if (containerOne - value < 0) {
                        containerOne = 0;
                    } else {
                        containerOne -= value;
                    }
                }
            }

            if (command.equals("remove")) {
                if (value > containerTwo) {
                    containerTwo = 0;
                    System.out.println();
                    continue;
                }

                if (containerTwo - value < 0) {
                    containerTwo = 0;
                } else {
                    containerTwo -= value;
                }
            }
            System.out.println();
        }
    }

}
