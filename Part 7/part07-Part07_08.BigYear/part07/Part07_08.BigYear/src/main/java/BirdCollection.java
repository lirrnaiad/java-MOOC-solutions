import java.util.ArrayList;
import java.util.Collections;

public class BirdCollection {
    private ArrayList<Bird> birds;

    public BirdCollection() {
        this.birds = new ArrayList<>();
    }

    public void add(String name, String nameLatin) {
        birds.add(new Bird(name, nameLatin));
    }

    public void addObservation(String name) {
        boolean found = false;

        for (int i = 0; i < birds.size(); i++) {
            if (birds.get(i).getName().equals(name)) {
                birds.get(i).addObservation();
                found = true;
            }
        }

        if (!found) {
            System.out.println("Not a bird!");
        }
    }

    public void printOne(String name) {
        for (Bird bird : birds) {
            if (bird.getName().equals(name)) {
                System.out.println(bird);
            }
        }
    }

    public void printAll() {
        for (Bird bird : birds) {
            System.out.println(bird);
        }
    }

}