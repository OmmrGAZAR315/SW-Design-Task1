public abstract class Vehicle {
    String model;
    String color;
    int year;
    double price;

    public Vehicle(String model, String color, int year, double price) {
        this.model = model;
        this.color = color;
        this.year = year;
        this.price = price;
    } // default constructor

    public abstract void displayInfo() ;
}
