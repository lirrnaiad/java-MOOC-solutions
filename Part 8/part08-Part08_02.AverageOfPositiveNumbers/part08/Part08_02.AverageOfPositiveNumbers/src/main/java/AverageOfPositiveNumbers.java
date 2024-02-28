
import java.util.Scanner;

public class AverageOfPositiveNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int sum = 0;
        double count = 0;
        while(true) {
            int num = Integer.valueOf(scanner.nextLine());

            if (num == 0) {
                break;
            } else if (num < 0) {
                continue;
            }

            sum += num;
            count++;
        }


        if (count == 0) {
            System.out.println("Cannot calculate the average");
        } else {
            System.out.println(sum / count);
        }
    }
}
