import java.util.ArrayList;

public class TodoList {
    private ArrayList<String> toDo;

    public TodoList() {
        this.toDo = new ArrayList<>();
    }

    public void add(String task) {
        toDo.add(task);
    }

    public void print() {
        int index = 1;
        for (String task : toDo) {
            System.out.println(index + ": " + task);
            index++;
        }
    }

    public void remove(int number) {
        toDo.remove(number - 1);
    }

}