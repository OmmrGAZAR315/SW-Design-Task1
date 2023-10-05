public class Customer {
    private String name;
    private double totalPay;
    private int numOfItems;

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

}
