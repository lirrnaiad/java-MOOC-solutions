
import java.util.ArrayList;
import java.util.Scanner;

public class FirstAndLast {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<String> list = new ArrayList<>();
        while (true) {
            String input = scanner.nextLine();
            if (input.equals("")) {
                break;
            }

            list.add(input);
        }

        int size = list.size();
        String firstString = list.get(0);
        String lastString = list.get(size - 1);

        System.out.println(firstString);
        System.out.println(lastString);
    }
}
