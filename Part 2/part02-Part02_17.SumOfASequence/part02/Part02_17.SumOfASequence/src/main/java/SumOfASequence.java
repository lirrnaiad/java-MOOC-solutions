
import java.util.Scanner;

public class SumOfASequence {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Last number? ");
        int lastSequenceNumber = scanner.nextInt();
        System.out.println("The sum is " + sum(lastSequenceNumber));
    }

    public static int sum (int n) {
        if (n == 0) {
            return 0;
        } else {
            return n + sum(n - 1);
        }
    }
}


