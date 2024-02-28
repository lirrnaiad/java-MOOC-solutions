
import java.util.Scanner;

public class AverageOfPositiveNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double numberOfPositiveNumbers = 0;
        int sumOfAllPositiveNumbers = 0;

        while (true) {
            int number = Integer.valueOf(scanner.nextLine());

            if (number == 0) {
                break;
            }

            if (number < 0) {
                continue;
            }

            numberOfPositiveNumbers++;
            sumOfAllPositiveNumbers += number;
        }

        if (numberOfPositiveNumbers == 0) {
            System.out.println("Cannot calculate the average");
        } else {
            System.out.println(sumOfAllPositiveNumbers / numberOfPositiveNumbers);
        }
    }
}
