import java.util.ArrayList;
import java.util.List;

public class Customer {
    private String name;
    private double totalPay;
    private int numOfItems;
    private List<Reading_item> itemList = new ArrayList<>();

    public Customer() {
    } // default constructor

    public Customer(String name, double totalPay, int numOfItems) {
        this.name = name;
        this.totalPay = totalPay;
        this.numOfItems = numOfItems;
    }

    public String getName() {
        return name;
    }

    public double getTotalPay() {
        return totalPay;
    }

    public int getNumOfItems() {
        return numOfItems;
    }

    public void printInfo() {
        System.out.println("YOU HAVE BOUGHT " + numOfItems + " ITEMS");
        System.out.println("TOTAL Charge: " + totalPay + " EGP");
    }

    public void setTotalPay(double price) {
        totalPay += price;
        numOfItems++;
    }

    public void buy(Reading_item item) {
        itemList.add(item);
        totalPay += item.getPrice();
        numOfItems++;
    }
}
