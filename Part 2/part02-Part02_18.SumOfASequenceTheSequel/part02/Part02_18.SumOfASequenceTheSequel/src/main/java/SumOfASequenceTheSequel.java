
import java.util.Scanner;

public class SumOfASequenceTheSequel {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("First number? ");
        int firstSequenceNumber = scanner.nextInt();
        System.out.print("Last number? ");
        int lastSequenceNumber = scanner.nextInt();

        System.out.println("The sum is " + sum(firstSequenceNumber, lastSequenceNumber));
    }

    public static int sum(int a, int b) {
        if (b < a) {
            return 0;
        } else {
            return b + sum(a, b - 1);
        }
    }
}
