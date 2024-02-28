import java.util.Scanner;

public class UserInterface {
    private Scanner scanner;
    private BirdCollection birdList;

    public UserInterface (Scanner scanner, BirdCollection birdList) {
        this.scanner = scanner;
        this.birdList = birdList;
    }

    public void start() {
        while (true) {
            System.out.print("? ");
            String command = scanner.nextLine();

            if (command.equals("Quit")) {
                break;
            }

            if (command.equals("Add")) {
                System.out.print("Name: ");
                String name = scanner.nextLine();
                System.out.print("Name in Latin: ");
                String nameLatin = scanner.nextLine();

                birdList.add(name, nameLatin);
            }

            if (command.equals("Observation")) {
                System.out.print("Bird? ");
                String bird = scanner.nextLine();
                birdList.addObservation(bird);
            }

            if (command.equals("All")) {
                birdList.printAll();
            }

            if (command.equals("One")) {
                System.out.print("Bird? ");
                String name = scanner.nextLine();
                birdList.printOne(name);
            }
        }
    }
}