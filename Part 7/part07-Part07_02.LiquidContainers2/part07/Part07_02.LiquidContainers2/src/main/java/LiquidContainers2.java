
import java.util.Scanner;

public class LiquidContainers2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Container containerOne = new Container();
        Container containerTwo = new Container();

        UserInterface ui = new UserInterface(containerOne, containerTwo, scanner);

        ui.start();
    }
}
