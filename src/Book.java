import java.util.ArrayList;
import java.util.List;

public class Book extends Reading_item {
    private String author;
    private static List<Book> books = new ArrayList<>();

    public Book() {
        books.add(this);
    }

    public Book(String title, double price, int year, String author) {
        super(title, price, year);
        this.author = author;
        books.add(this);
    }

    @Override
    public void displayInfo() {
        System.out.print("Title: " + getTitle());
        System.out.print("\tPrice: " + getPrice());
        System.out.print("\tYear: " + getYear());
        System.out.println("\tAuthor: " + author + "\n");
    }

    public static void printAllObjects() {
        for (int i = 0; i < books.size(); i++) {
            System.out.print(i+1 + "- ");
            books.get(i).displayInfo();
        }
    }
}
