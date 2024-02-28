
import java.nio.file.Paths;
import java.util.Scanner;

public class NumbersFromAFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("File? ");
        String file = scanner.nextLine();
        System.out.print("Lower bound? ");
        int lowerBound = Integer.valueOf(scanner.nextLine());
        System.out.print("Upper bound? ");
        int upperBound = Integer.valueOf(scanner.nextLine());

        int numberCount = 0;
        try (Scanner reader = new Scanner(Paths.get(file))) {
            while (reader.hasNextLine()) {
                int num = Integer.valueOf(reader.nextLine());
                if (num >= lowerBound && num <= upperBound) {
                    numberCount++;
                }
            }
            System.out.println("Numbers: " + numberCount);
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
