public class Vehicle {
    private int seats;
    private double weight;
    private int size;
    private int speed;
    private String direction;

    public Vehicle(int seats, double weight, int size){
        this.seats = seats;
        this.weight = weight;
        this.size = size;
        this.speed = 0; //when created a vehicle as has speed 0
        this.direction = "None"; //when created a vehicle has no direction
    }

    public void changeSpeed (int speed){
        this.speed += speed; // the speed can be increased and decreased, if speed = 0 it's standing still, if speed < 0 it's moving backwards
        System.out.println("Vehicle.changeSpeed() called. Moving at " + speed);
    }

    public void changeDirection (String direction){
        this.direction = direction;
        System.out.println("Vehicle.changeDirection() called. New direction is " +direction);
    }
}
