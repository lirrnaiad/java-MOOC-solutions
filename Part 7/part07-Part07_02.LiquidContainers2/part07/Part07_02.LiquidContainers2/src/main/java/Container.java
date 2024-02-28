public class Container {
    private int containerAmount;

    public Container() {
        this.containerAmount = 0;
    }

    public int contains() {
        return this.containerAmount;
    }
    public void add(int amount) {
        if (amount <= 0) {
            containerAmount += 0;
        } else {
            containerAmount += amount;
        }

        if (containerAmount > 100) {
            containerAmount = 100;
        }
    }

    public void remove(int amount) {
        containerAmount -= amount;

        if (containerAmount < 0) {
            containerAmount = 0;
        }
    }

    public String toString() {
        return containerAmount + "/100";
    }
}
