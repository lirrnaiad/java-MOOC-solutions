
import java.util.Scanner;

public class AverageOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double numberOfNumbers = 0;
        int sumOfAllNumbers = 0;

        while (true) {
            System.out.println("Give a number:");
            int number = Integer.valueOf(scanner.nextLine());

            if (number == 0) {
                break;
            }

            numberOfNumbers++;
            sumOfAllNumbers += number;
        }

        System.out.println("Average of the numbers: " + (sumOfAllNumbers / numberOfNumbers));
    }
}
