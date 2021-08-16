package pl.sda.inheritance;

public class Customer {

    private final String name;
    public float accountSum = 0.0f;

    public Customer(String name) {
        this.name = name;
    }

    public void payIn(float money) {
        accountSum += money;
    }

    public void withdrawAll() {
        accountSum = 0;
    }

    public String getName() {
        return name;
    }

    public float getAccountSum() {
        return accountSum;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "name='" + name + '\'' +
                ", accountSum=" + accountSum +
                '}';
    }
}
