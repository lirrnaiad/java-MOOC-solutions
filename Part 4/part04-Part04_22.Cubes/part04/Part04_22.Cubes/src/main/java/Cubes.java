
import java.util.Scanner;

public class Cubes {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while(true) {
            String number = scanner.nextLine();
            if (number.equals("end")) break;

            int num = Integer.parseInt(number);
            System.out.println(num * num * num);
        }
    }
}
