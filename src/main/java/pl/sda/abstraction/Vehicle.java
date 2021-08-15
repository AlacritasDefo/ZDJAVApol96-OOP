package pl.sda.abstraction;

public abstract class Vehicle {

    private final String licensePlate;

    protected Vehicle(String licensePlate) {
        this.licensePlate = licensePlate;
    }

    public String getLicensePlate() {
        return licensePlate;
    }

    public abstract void move();
}
