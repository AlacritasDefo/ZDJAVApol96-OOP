package pl.sda.abstraction;

public abstract class Animal {
    private final int Age;
    private final int Weight;

    protected Animal(int age, int weight) {
        Age = age;
        Weight = weight;
    }

    public abstract void move();
}
