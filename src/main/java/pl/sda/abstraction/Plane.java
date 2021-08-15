package pl.sda.abstraction;

public class Plane extends Vehicle {

    public Plane(String licensePlate) {
        super(licensePlate);
    }

    @Override
    public void move() {
        System.out.println("Lecę!");
    }
}
