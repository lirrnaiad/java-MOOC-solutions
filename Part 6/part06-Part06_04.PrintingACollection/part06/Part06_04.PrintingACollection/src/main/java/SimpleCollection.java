
import java.util.ArrayList;

public class SimpleCollection {

    private String name;
    private ArrayList<String> elements;

    public SimpleCollection(String name) {
        this.name = name;
        this.elements = new ArrayList<>();
    }

    public void add(String element) {
        this.elements.add(element);
    }

    public ArrayList<String> getElements() {
        return this.elements;
    }

    @Override
    public String toString() {
        String printOutput = "The collection " + this.name;
        if (elements.isEmpty()) {
            return printOutput + " is empty.";
        } else if (elements.size() == 1) {
            return printOutput + " has 1 element:\n" + elements.get(0);
        }

        String elementNames = "";

        for (String element : elements) {
            elementNames += element + "\n";
        }
        return printOutput + " has " + elements.size() + " elements:\n" + elementNames;
    }
}
