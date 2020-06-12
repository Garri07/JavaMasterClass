public class Volvo extends Car {

    private String model;
    private String color;

    public Volvo(int seats, double weight, int size, int wheels, String engineType, int doors, int gears, String model, String color) {
        super(seats, weight, size, wheels, engineType, "Volvo", doors, gears);
        this.model = model;
        this.color = color;
    }


}
