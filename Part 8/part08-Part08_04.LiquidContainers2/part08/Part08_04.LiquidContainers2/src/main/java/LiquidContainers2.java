
import java.util.Scanner;

public class LiquidContainers2 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Container containerOne = new Container();
        Container containerTwo = new Container();

        while (true) {
            System.out.println("First: " + containerOne);
            System.out.println("Second: " + containerTwo);
            System.out.print("> ");

            String input = scan.nextLine();
            if (input.equals("quit")) {
                break;
            }

            String[] parts = input.split(" ");
            String command = parts[0];
            int value = Integer.valueOf(parts[1]);

            if (command.equals("add")) {
                containerOne.add(value);
            }

            if (command.equals("move")) {
                if (value > containerOne.contains()) {
                    containerTwo.add(containerOne.contains());
                    containerOne.remove(value);
                } else {
                    containerTwo.add(value);
                    containerOne.remove(value);
                }
            }

            if (command.equals("remove")) {
                containerTwo.remove(value);
            }

            System.out.println();
        }
    }

}
