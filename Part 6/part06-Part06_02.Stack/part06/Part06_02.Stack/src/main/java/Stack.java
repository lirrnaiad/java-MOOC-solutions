import java.util.ArrayList;

public class Stack {
    private ArrayList<String> strings;

    public Stack() {
        this.strings = new ArrayList<>();
    }

    public boolean isEmpty() {
        return strings.isEmpty();
    }

    public void add(String value) {
        strings.add(value);
    }

    public ArrayList<String> values() {
        return strings;
    }

    public String take() {
        String last = strings.get(strings.size() - 1);
        strings.remove(last);
        return last;
    }
}
