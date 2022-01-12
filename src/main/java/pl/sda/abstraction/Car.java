package pl.sda.abstraction;

public class Car extends Vehicle {

    public Car(String licensePlate) {
        super(licensePlate);
    }

    @Override
    public void move() {
        System.out.println("Jadę!");
    }

}