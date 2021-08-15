package pl.sda.inheritance;

public class Customer {

    private final String name;
    private float accountSum = 0.0f;

    public Customer(String name) {
        this.name = name;
    }

    public void payIn(float money) {
        accountSum += money;
    }

    protected void withdrawAll() {
        accountSum = 0;
    }

    public String getName() {
        return name;
    }

    public float getAccountSum() {
        return accountSum;
    }
}
