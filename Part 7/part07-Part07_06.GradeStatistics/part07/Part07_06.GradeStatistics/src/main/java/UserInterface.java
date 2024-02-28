import java.util.Scanner;

public class UserInterface {
    private Points points;
    private Scanner scanner;

    public UserInterface(Points points, Scanner scanner) {
        this.points = points;
        this.scanner = scanner;
    }

    public void start() {
        System.out.println("Enter point totals, -1 stops:");

        while(true) {
            int input = Integer.valueOf(scanner.nextLine());
            if (input == -1) break;

            if (input >= 0 && input <= 100) {
                points.add(input);
            }
        }

        // Print point average
        System.out.println("Point average (all): " + points.averageAll());

        // Print point average for passing points only (>50)
        if (points.averagePassing() == 0) {
            System.out.println("Points average (passing): -");
        } else System.out.println("Point average (passing): " + points.averagePassing());

        // Print pass percentage
        System.out.println("Pass percentage: " + points.passPercentage());

        // Print grade distribution
        printGradeDistribution();
    }

    public void printGradeDistribution() {
        System.out.println("Grade distribution:");
        System.out.print("5: ");
        points.categorizeGrade(90, 100);
        System.out.print("4: ");
        points.categorizeGrade(80, 89);
        System.out.print("3: ");
        points.categorizeGrade(70, 79);
        System.out.print("2: ");
        points.categorizeGrade(60, 69);
        System.out.print("1: ");
        points.categorizeGrade(50, 59);
        System.out.print("0: ");
        points.categorizeGrade(0, 49);
    }
}