
import java.util.Scanner;

public class FirstWords {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String sentence = scanner.nextLine();
        while (!sentence.isBlank()) {
            String[] words = sentence.split(" ");
            System.out.println(words[0]);
            sentence = scanner.nextLine();
        }
    }
}
