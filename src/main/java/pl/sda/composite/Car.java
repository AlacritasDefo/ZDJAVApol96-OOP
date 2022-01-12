package pl.sda.composite;

public class Car {

    private final Engine engine;
    private final Gearbox gearbox;

    public Car(Engine engine, Gearbox gearbox) {
        this.engine = engine;
        this.gearbox = gearbox;
    }

    public void start() {
        engine.start();
    }

    public void changeGear() {
        gearbox.changeGear();
    }
}