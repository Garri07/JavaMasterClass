public class Vehicle {
    private int seats;
    private double weight;
    private int size;
    private int speed;

    public Vehicle(int seats, double weight, int size){
        this.seats = seats;
        this.weight = weight;
        this.size = size;
        this.speed = 0; //when created a vehicle as has speed 0
    }

    public void changeSpeed (int speed){
        this.speed += speed; // the speed can be increased and decreased, if speed = 0 it's standing still, if speed < 0 it's moving backwards
    }
}
