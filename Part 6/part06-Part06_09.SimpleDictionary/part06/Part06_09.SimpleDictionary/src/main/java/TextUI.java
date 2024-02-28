import java.util.Scanner;


public class TextUI {
    private Scanner scanner;
    private SimpleDictionary object;

    public TextUI(Scanner scanner, SimpleDictionary object) {
        this.scanner = scanner;
        this.object = object;
    }

    public void start() {
        while (true) {
            String word;
            String translation;
            System.out.print("Command: ");
            String input = scanner.nextLine();

            if (input.equals("end")) {
                System.out.println("Bye bye!");
                break;

            } else if (input.equals("add")) {
                System.out.print("Word: ");
                word = scanner.nextLine();
                System.out.print("Translation: ");
                translation = scanner.nextLine();

                object.add(word, translation);
            } else if (input.equals("search")) {
                System.out.print("To be translated: ");
                word = scanner.nextLine();

                if (object.translate(word) != null) {
                    System.out.println("Translation: " + object.translate(word));
                } else {
                    System.out.println("Word " + word + " was not found");
                }
            }

            else System.out.println("Unknown command");
        }
    }
}