
import java.util.ArrayList;

public class RemoveLast {

    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("Florida");
        list.add("Washington");
        list.add("Texas");
        list.add("Ohio");

        // Try your method in here
        removeLast(list);
        System.out.println(list);
    }

    public static void removeLast(ArrayList<String> strings) {
        if (strings.size() == 0) {
            return;
        }

        strings.remove(strings.size() - 1);
    }
}
