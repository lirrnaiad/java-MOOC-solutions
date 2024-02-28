
import java.util.ArrayList;

public class Sum {

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(24);
        list.add(14);
        list.add(31);
        // Try your method here
        System.out.println(sum(list));

        list.add(151);
        list.add(200);
        System.out.println(sum(list));
    }

    public static int sum(ArrayList<Integer> numbers) {
        int sum = 0;
        for (int number : numbers) {
            sum += number;
        }

        return sum;
    }
}
