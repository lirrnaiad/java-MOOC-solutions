
import java.util.ArrayList;

public class NullPointerExceptionProgram {
    public static void main(String[] args) {
        Book book1 = new Book("And Then There Were None");
        System.out.println(book1);

        Book book2 = book1;

        book1 = null;
        book1.setBookAuthor("Agatha Christie");
    }
}
