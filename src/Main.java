import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Book book1 = new Book("Java", 100, 2020, "Ahmed");
        Book book2 = new Book("C++", 150, 1979, "Willam");
        Book book3 = new Book("Python", 200, 2010, "Mohamed");
        Book book4 = new Book("C#", 250, 2015, "Ali");
        Book book5 = new Book("JavaScript", 300, 2019, "Mahmoud");
        Book book6 = new Book("PHP", 350, 2018, "Hassan");
        Book[] books = {book1, book2, book3, book4, book5, book6};

        Customer customer = new Customer("Ahmed", 0, 0);

        System.out.println("Welcome " + customer.getName() + " to our library\n");
        System.out.println("Please choose the book you want to buy: \n");
        while (true) {
            for (int i = 0; i < books.length; i++) {
                System.out.print((i + 1) + "- ");
                books[i].displayInfo();
            }
            char option = scanner.next().charAt(0);

            books[option - '1'].displayInfo();
            System.out.println("Are you sure you want to buy this book? (y/n)");
            char option2 = scanner.next().charAt(0);
            if (option2 == 'y')
                customer.setTotalPay(books[option - '1'].getPrice());

            System.out.println("Do you want to buy another book? (y/n)");
            char choice = scanner.next().charAt(0);
            if (choice == 'n') break;
        }

        customer.printInfo();
        System.out.println("Thank you " + customer.getName() + " for buying from our library");

    }

}