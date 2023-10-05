public class Car extends Vehicle {

    public Car(String model, String color, int year, double price) {
        super(model, color, year, price);
    } // default constructor

    @Override
    public void displayInfo() {
        System.out.println("Car model: " + model);
        System.out.println("Car color: " + color);
        System.out.println("Car year: " + year);
        System.out.println("Car price: " + price);
    }
}
