import java.util.Scanner;

public class UserInterface {
    private TodoList list;
    private Scanner scanner;

    public UserInterface(TodoList list, Scanner scan) {
        this.list = list;
        this.scanner = scan;
    }

    public void start() {
        while(true) {
            System.out.print("Command: ");
            String input = scanner.nextLine();

            if (input.equals("stop")) {
                break;
            } else if (input.equals("add")) {
                System.out.print("To add: ");
                input = scanner.nextLine();
                list.add(input);
            } else if (input.equals("list")) {
                list.print();
            } else if (input.equals("remove")) {
                System.out.print("Which one is removed? ");
                int number = Integer.valueOf(scanner.nextLine());
                list.remove(number);
            }
        }
    }
}