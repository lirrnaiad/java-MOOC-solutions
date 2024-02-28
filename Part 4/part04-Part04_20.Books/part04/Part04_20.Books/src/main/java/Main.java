import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // implement here the program that allows the user to enter 
        // book information and to examine them
        ArrayList<Book> books = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        while(true) {
            System.out.print("Title: ");
            String bookTitle = scanner.nextLine();
            if (bookTitle.isEmpty()) {
                break;
            }
            System.out.print("Pages: ");
            int bookPages = Integer.valueOf(scanner.nextLine());
            System.out.print("Publication year: ");
            int bookYear = Integer.valueOf(scanner.nextLine());

            books.add(new Book(bookTitle, bookPages, bookYear));
        }

        System.out.print("What information will be printed? ");
        String print = scanner.nextLine();

        for (Book book : books) {
            if(print.equals("everything")) {
                System.out.println(book);
            } else if (print.equals("name")) {
                System.out.println(book.getTitle());
            }
        }
    }
}
