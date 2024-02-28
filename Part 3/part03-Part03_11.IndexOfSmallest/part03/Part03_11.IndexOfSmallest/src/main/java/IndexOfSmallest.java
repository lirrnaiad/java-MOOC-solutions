
import java.util.ArrayList;
import java.util.Scanner;

public class IndexOfSmallest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // implement here a program that reads user input
        // until the user enters 9999
        ArrayList<Integer> list = new ArrayList<>();
        while (true) {
            int input = Integer.valueOf(scanner.nextLine());
            if (input == 9999) {
                break;
            }

            list.add(input);
        }

        // after that, the program prints the smallest number
        // and its index -- the smallest number
        // might appear multiple times

        // Search the smallest number first
        int smallest = list.get(0);
        ArrayList<Integer> indexFound = new ArrayList<>();

        for (Integer integer : list) {
            if (integer < smallest) {
                smallest = integer;
            }
        }

        // After finding the smallest number, find in which indexes it exists
        // If found, add it to the indexFound arrayList
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) == smallest) {
                indexFound.add(i);
            }
        }

        System.out.println("Smallest number: " + smallest);
        for (Integer foundAt : indexFound) {
            System.out.println("Found at index: " + foundAt);
        }
    }
}
