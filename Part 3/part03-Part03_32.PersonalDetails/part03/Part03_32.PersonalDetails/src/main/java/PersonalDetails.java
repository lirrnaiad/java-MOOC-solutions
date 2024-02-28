
import java.util.ArrayList;
import java.util.Scanner;

public class PersonalDetails {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        float birthYearCount = 0;
        int birthYearTotal = 0;
        int longestNameLength = 0;
        String longestName = null;
        while(true) {
            String info = scanner.nextLine();
            if (info.isBlank()) break;

            String[] details = info.split(",");
            if (details[0].length() > longestNameLength) {
                longestNameLength = details[0].length();
                longestName = details[0];
            }

            birthYearTotal += Integer.valueOf(details[1]);
            birthYearCount++;
        }

        System.out.println("Longest name: " + longestName);
        System.out.println("Average of the birth years: " + (birthYearTotal / birthYearCount));
    }
}
