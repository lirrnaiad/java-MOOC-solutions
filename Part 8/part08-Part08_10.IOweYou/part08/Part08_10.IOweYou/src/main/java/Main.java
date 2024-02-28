
public class Main {

    public static void main(String[] args) {
        // Test your program here
        IOU mattsIOU = new IOU();
        mattsIOU.setSum("Arthur", 51.5);
        mattsIOU.setSum("Arthur", 23);
        mattsIOU.setSum("Sean", 69);

        System.out.println(mattsIOU.howMuchDoIOweTo("Arthur"));
        System.out.println(mattsIOU.howMuchDoIOweTo("Sean"));
        System.out.println(mattsIOU.howMuchDoIOweTo("test"));
    }
}
