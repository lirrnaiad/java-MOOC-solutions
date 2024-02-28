public class Container {
    private int value;

    public Container() {
        this.value = 0;
    }

    public int contains() {
        return this.value;
    }

    public void add(int amount) {
        if (amount < 0) {
            return;
        }

        if (value + amount > 100) {
            value = 100;
        } else {
            value += amount;
        }
    }

    public void remove(int amount) {
        if (amount < 0) {
            return;
        }

        if (value - amount < 0) {
            value = 0;
        } else {
            value -= amount;
        }
    }

    @Override
    public String toString() {
        return value + "/100";
    }
}
