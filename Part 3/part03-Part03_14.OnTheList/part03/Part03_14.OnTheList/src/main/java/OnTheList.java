
import java.util.ArrayList;
import java.util.Scanner;

public class OnTheList {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<String> list = new ArrayList<>();
        while (true) {
            String input = scanner.nextLine();
            if (input.equals("")) {
                break;
            }

            list.add(input);
        }

        System.out.print("Search? ");
        String stringToBeSearched = scanner.nextLine();

        if (list.contains(stringToBeSearched)) {
            System.out.println(stringToBeSearched + " was found!");
        } else {
            System.out.println(stringToBeSearched + " was not found!");
        }
    }
}
