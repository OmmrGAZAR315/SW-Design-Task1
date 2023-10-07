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
        if (getTitle().length() > 16)
            setTitle(getTitle().substring(0, 14) + "...");
        if (author.length() > 16)
            author = (author.substring(0, 14) + "...");

        System.out.printf("| %-17s | %-17s | %-11f | %-12d |\n", getTitle(), author, getPrice(), getYear());
    }

    public static void printAllObjects() {
        System.out.println("+-------------------+-------------------+-------------+--------------+");
        System.out.println("|      Title        |      Author       |     Year    |     Price    |");
        System.out.println("+-------------------+-------------------+-------------+--------------+");
        for (int i = 0; i < books.size(); i++)
            books.get(i).displayInfo();
        System.out.println("+-------------------+-------------------+-------------+--------------+");
    }
}
