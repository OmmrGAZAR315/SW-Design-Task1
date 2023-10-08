import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Book[] books = new Book[6];

        books[0] = new Book("Java", 100, 2020, "Ahmed");
        books[1] = new Book("C++", 150, 1979, "William");
        books[2] = new Book("Python", 200, 2010, "Mohamed");
        books[3] = new Book("C#", 250, 2015, "Ali");
        books[4] = new Book("JavaScript", 300, 2019, "Mahmoud");
        books[5] = new Book("PHP", 350, 2018, "Hassan");

        Customer customer = new Customer("Ahmed", 0, 0);

        System.out.println("Welcome " + customer.getName() + " to our library\n");
        System.out.println("Please choose the book you want to buy: \n");
        while (true) {
            Book.printAllObjects();
            char option = scanner.next().charAt(0);

            System.out.print("      ");
            books[option - '1'].displayInfo();
            System.out.println("Are you sure you want to buy this book? (y/n)");
            char option2 = scanner.next().charAt(0);
            if (option2 == 'y')
                customer.buy(books[option - '1']);

            System.out.println("Do you want to buy another book? (y/n)");
            char choice = scanner.next().charAt(0);
            if (choice == 'n') break;
        }

        customer.printInfo();
        System.out.println("Thank you " + customer.getName() + " for buying from our library");

    }

}