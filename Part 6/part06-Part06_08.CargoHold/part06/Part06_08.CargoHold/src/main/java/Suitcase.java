import java.util.ArrayList;

public class Suitcase {
    private ArrayList<Item> items;
    private int maxWeight;
    private int currentWeight;

    public Suitcase(int maxWeight) {
        this.items = new ArrayList<>();
        this.maxWeight = maxWeight;
        this.currentWeight = 0;
    }

    public void addItem(Item item) {
        if (!((currentWeight + item.getWeight()) > maxWeight)) {
            items.add(item);
            currentWeight += item.getWeight();
        }
    }

    public void printItems() {
        for (Item item : items) {
            System.out.println(item.getName() + " (" + item.getWeight() + " kg)");
        }
    }

    public int totalWeight() {
        int totalWeight = 0;
        for (Item item : items) {
            totalWeight += item.getWeight();
        }

        return totalWeight;
    }

    public Item heaviestItem() {
        if (items.isEmpty()) {
            return null;
        }

        Item heaviest = items.get(0);
        for (Item item : items) {
            if (item.getWeight() > heaviest.getWeight()) {
                heaviest = item;
            }
        }
        return heaviest;
    }

    @Override
    public String toString() {
        int totalWeight = 0;
        for (Item item : items) {
            totalWeight += item.getWeight();
        }

        if (items.isEmpty()) {
            return "no items " + "(" + totalWeight + " kg)";
        } else if (items.size() == 1) {
            return "1 item " + "(" + totalWeight + " kg)";
        }
        return items.size() + " items " + "(" + totalWeight + " kg)";
    }
}