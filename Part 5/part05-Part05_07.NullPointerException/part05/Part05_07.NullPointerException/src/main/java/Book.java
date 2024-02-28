public class Book {
    private String bookName;
    private String bookAuthor;
    private int yearPublished;

    public Book(String name, String author, int year) {
        this.bookName = name;
        this.bookAuthor = author;
        this.yearPublished = year;
    }

    public Book(String name) {
        this.bookName = name;
        this.bookAuthor = "Unknown";
        this.yearPublished = 0;
    }

    public void setBookAuthor(String author) {
        this.bookAuthor = author;
    }

    public void setYearPublished(int year) {
        this.yearPublished = year;
    }

    @Override
    public String toString() {
        return "Book: " + bookName + "\n" + "Author: " + bookAuthor + "\n" + "Year: " + yearPublished;
    }
}

