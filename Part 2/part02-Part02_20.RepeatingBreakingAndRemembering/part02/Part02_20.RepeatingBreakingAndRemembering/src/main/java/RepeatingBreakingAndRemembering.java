
import java.util.Scanner;

public class RepeatingBreakingAndRemembering {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int sum = 0;
        int numOfNumbers = 0;
        int evenNumbers = 0;
        int oddNumbers = 0;

        System.out.println("Give numbers:");
        while (true) {
            int number = Integer.valueOf(scanner.nextLine());

            if (number == -1) {
                System.out.println("Thx! Bye!");
                break;
            }

            if (number % 2 == 0) {
                evenNumbers++;
            } else {
                oddNumbers++;
            }
            numOfNumbers++;
            sum += number;
        }

        double average = sum / (double) numOfNumbers;
        System.out.println("Sum: " + sum);
        System.out.println("Numbers: " + numOfNumbers);
        System.out.println("Average: " + average);
        System.out.println("Even: " + evenNumbers);
        System.out.println("Odd: " + oddNumbers);
    }
}
