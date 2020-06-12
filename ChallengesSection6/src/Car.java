public class Car extends Vehicle {

    private int wheels;
    private String engineType;
    private String brand;
    private int doors;
    private int gears;

    public Car(int seats, double weight, int size, int wheels, String engineType, String brand, int doors, int gears) {
        super(seats, weight, size);
        this.wheels = wheels;
        this.engineType = engineType;
        this.brand = brand;
        this.doors = doors;
        this.gears = gears;
    }

    public void changeGears(int gear) {
        this.gears = gear;
        System.out.println("changeGears() called. Gear has been changed to " + gear);
    }
}
