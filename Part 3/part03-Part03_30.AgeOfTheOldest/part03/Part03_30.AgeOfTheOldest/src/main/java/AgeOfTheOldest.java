import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

public class AgeOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<String> names = new ArrayList<String>();
        ArrayList<Integer> ages = new ArrayList<Integer>();
        String details = scanner.nextLine();
        while (!details.isBlank()) {
            String[] userNameAndAge = details.split(",");
            names.add(userNameAndAge[0]);
            ages.add(Integer.valueOf(userNameAndAge[1]));
            details = scanner.nextLine();
        }
        Collections.sort(ages);
        int oldest = ages.get(ages.size() - 1);
        System.out.println("Age of the oldest: " + oldest);
    }
}
