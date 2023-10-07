public abstract class Reading_item {
    private String title;
    private double price;
    private int year;

    public Reading_item() {
    } // default constructor

    public Reading_item(String title, double price, int year) {
        this.title = title;
        this.price = price;
        this.year = year;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public double getPrice() {
        return price;
    }

    public int getYear() {
        return year;
    }

    public abstract void displayInfo();
}
