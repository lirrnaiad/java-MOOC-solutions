import java.util.Scanner;
import java.util.ArrayList;

public class NameOfTheOldest {

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

        int oldest= 0;
        int oldestIndex = 0;
        for (int i = 0; i < ages.size(); i++) {
            if (ages.get(i) > oldest) {
                oldest = ages.get(i);
                oldestIndex = i;
            }
        }
        System.out.println("Name of the oldest: " + names.get(oldestIndex));
    }
}