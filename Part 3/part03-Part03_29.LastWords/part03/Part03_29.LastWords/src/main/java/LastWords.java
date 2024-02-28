
import java.util.Scanner;

public class LastWords {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String sentence = scanner.nextLine();
        while (!sentence.isBlank()) {
            String[] words = sentence.split(" ");
            System.out.println(words[words.length - 1]);
            sentence = scanner.nextLine();
        }
    }
}
