import java.util.ArrayList;

public class Points {

    private ArrayList<Integer> points;

    public Points() {
        this.points = new ArrayList<>();
    }

    public void add(int point) {
        if (point >= 0 && point <= 100) {
            this.points.add(point);
        }
    }

    public int count() {
        int count = 0;
        for (int point : points) {
            count++;
        }

        return count;
    }

    public int passingCount() {
        int count = 0;
        for (int point : points) {
            if (point >= 50) {
                count++;
            }
        }

        return count;
    }

    public int sum() {
        int sum = 0;
        for (int point : points) {
            sum += point;
        }

        return sum;
    }

    public double averageAll() {
        return (float) sum() / count();
    }

    public double averagePassing() {
        double passingSum = 0;

        // Add the passing points
        for (int point : points) {
            if (point >= 50) {
                passingSum += point;
            }
        }

        if (passingCount() == 0) {
            return 0;
        }

        return passingSum / passingCount();
    }

    public double passPercentage() {
        int passingCount = 0;

        for (int point : points) {
            if (point >= 50) {
                passingCount++;
            }
        }

        return 100 * (float) passingCount() / count();
    }

    public void categorizeGrade(int min, int max) {
        for (int point : points) {
            if (point >= min && point <= max) {
                System.out.print("*");
            }
        }

        System.out.println();
    }
}