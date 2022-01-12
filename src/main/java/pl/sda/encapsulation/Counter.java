package pl.sda.encapsulation;

public class Counter {
    private String name;
    private int value = 0;

    public Counter(String name) {
        this.name = name;
    }

    public int getValue() {
        return value;
    }

    public String getName() {
        return name;
    }

    public void count() {
        value++;
    }

    public static void main(String[] args) {
        Counter counter = new Counter("Luis");
        for (int i = 0; i < 10; i++) {
            counter.count();
            System.out.println(counter.getValue());
        }
    }
}