public class Book extends Reading_item{
private String author;
public Book(){}
public Book(String title, double price, int year, String author){
    super(title, price, year);
    this.author = author;
}
    @Override
    public void displayInfo() {
        System.out.println("Title: " + getTitle());
        System.out.println("Price: " + getPrice());
        System.out.println("Year: " + getYear());
        System.out.println("Author: " + author);
    }
}
