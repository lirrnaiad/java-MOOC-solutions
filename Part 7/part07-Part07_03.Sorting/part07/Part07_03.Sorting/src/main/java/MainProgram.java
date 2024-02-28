import java.util.Arrays;


public class MainProgram {

    public static void main(String[] args) {
        // write your test code here
        int[] numbers = {8, 3, 7, 6, 9, 1, 2, 4, 5};
        MainProgram.sort(numbers);
    }

    public static int smallest(int[] array) {
        int smallest = array[0];

        for (int i = 0; i < array.length; i++) {
            if (array[i] < smallest) {
                smallest = array[i];
            }
        }

        return smallest;
    }

    public static int indexOfSmallest(int[] array) {
        int indexOfSmallest = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] < array[indexOfSmallest]) {
                indexOfSmallest = i;
            }
        }

        return indexOfSmallest;
    }

    public static int indexOfSmallestFrom(int[] array, int startIndex) {
        int indexOfSmallest = startIndex;

        for (int i = startIndex; i < array.length; i++) {
            if (array[i] < array[indexOfSmallest]) {
                indexOfSmallest = i;
            }
        }

        return indexOfSmallest;
    }

    public static void swap(int[] array, int index1, int index2) {
        int temp;
        temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;
    }

    public static void sort(int[] array) {
        for (int i = 0; i < array.length; i++) {
            int smallest = indexOfSmallestFrom(array, i);
            swap(array, i, smallest);

            System.out.println(Arrays.toString(array));
        }
    }
}
