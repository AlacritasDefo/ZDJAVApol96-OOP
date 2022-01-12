package pl.sda.composite;

import pl.sda.inheritance.Customer;

public class VipCustomer {

    private final Customer customer;

    public VipCustomer(Customer customer) {
        this.customer = customer;
    }


    public void payIn(float money) {
        customer.payIn(money);
    }

    public float getAccountSum() {
        return customer.accountSum;
    }

    public void withdrawAll() {
        customer.withdrawAll();
    }

    @Override
    public String toString() {
        return "VipCustomer{" +
                "customer=" + customer +
                '}';
    }
    public static void main(String[] args) {
        VipCustomer customer = new VipCustomer(new Customer("Zenek"));
        customer.getAccountSum();
        customer.payIn(20);
        customer.getAccountSum();
        System.out.println(customer + " " + customer.getAccountSum());
        customer.withdrawAll();
        System.out.println(customer + " " + customer.getAccountSum());
    }
}