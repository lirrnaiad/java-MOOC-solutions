public class Statistics {
    private int count;
    private int sum;

    public Statistics() {
        this.count = 0;
        this.sum = 0;
    }

    public void addNumber(int number) {
        this.count++;
        this.sum += number;
    }

    public int sum() {
        return this.sum;
    }

    public int getCount() {
        return this.count;
    }

    public double average() {
        if (this.sum == 0 || this.count == 0) {
            return 0;
        } else return this.sum / (float) this.count;
    }
}
