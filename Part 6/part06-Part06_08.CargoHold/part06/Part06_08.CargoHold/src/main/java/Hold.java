import java.util.ArrayList;

public class Hold {
    private ArrayList<Suitcase> suitcases;
    private int maxWeight;
    private int currentWeight;

    public Hold(int maxWeight) {
        this.suitcases = new ArrayList<>();
        this.maxWeight = maxWeight;
        this.currentWeight = 0;
    }
    public void addSuitcase(Suitcase suitcase) {
        if (!((this.currentWeight + suitcase.totalWeight()) > maxWeight)) {
            suitcases.add(suitcase);
            currentWeight += suitcase.totalWeight();
        }
    }

    public void printItems() {
        for (Suitcase suitcase : suitcases) {
            suitcase.printItems();
        }
    }

    @Override
    public String toString() {
        int totalWeight = 0;
        for (Suitcase suitcase : suitcases) {
            totalWeight += suitcase.totalWeight();
        }

        if (suitcases.isEmpty()) {
            return null;
        } else if (suitcases.size() == 1) {
            return "1 suitcase " + "(" + totalWeight + " kg)";
        }

        return suitcases.size() + " suitcases " + "(" + totalWeight + " kg)";
    }
}
