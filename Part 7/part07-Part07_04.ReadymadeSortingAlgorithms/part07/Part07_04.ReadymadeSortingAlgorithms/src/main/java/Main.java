import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Main {

    public static void main(String[] args) {
        // insert test code here
        int[] array = {3, 1, 5, 99, 3, 12};

        String[] arrayString = {"Delta", "Charlie", "Bravo", "Echo", "Alpha"};

        ArrayList<Integer> arrayIntegers = new ArrayList<>();
        arrayIntegers.add(6);
        arrayIntegers.add(12);
        arrayIntegers.add(3);
        arrayIntegers.add(2);
        arrayIntegers.add(5);

        ArrayList<String> arrayStrings = new ArrayList<>();
        arrayStrings.add("Golf");
        arrayStrings.add("Hotel");
        arrayStrings.add("Foxtrot");
        arrayStrings.add("Juliette");
        arrayStrings.add("India");

        System.out.println("Unsorted:");
        System.out.println(Arrays.toString(array));
        System.out.println(Arrays.toString(arrayString));
        System.out.println(arrayIntegers);
        System.out.println(arrayStrings);

        sort(array);
        sort(arrayString);
        sortIntegers(arrayIntegers);
        sortStrings(arrayStrings);
        System.out.println();

        System.out.println("Sorted:");
        System.out.println(Arrays.toString(array));
        System.out.println(Arrays.toString(arrayString));
        System.out.println(arrayIntegers);
        System.out.println(arrayStrings);
    }

    public static void sort(int[] array) {
        Arrays.sort(array);
    }

    public static void sort(String[] array) {
        Arrays.sort(array);
    }

    public static void sortIntegers(ArrayList<Integer> integers) {
        Collections.sort(integers);
    }

    public static void sortStrings(ArrayList<String> strings) {
        Collections.sort(strings);
    }
}
