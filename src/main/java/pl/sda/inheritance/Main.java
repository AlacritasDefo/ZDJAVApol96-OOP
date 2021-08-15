package pl.sda.inheritance;

public class Main {

    public static void main(String... args) {
        Customer regularCustomer = new Customer("Dave");
        VipCustomer vipCustomer = new VipCustomer("Kevin");

        regularCustomer.payIn(1000.0f);
        vipCustomer.payIn(2000.0f);

        printAccountValues(regularCustomer);
        printAccountValues(vipCustomer);

        regularCustomer.withdrawAll();
        vipCustomer.withdrawAll();

        printAccountValues(regularCustomer);
        printAccountValues(vipCustomer);
    }

    private static void printAccountValues(Customer customer) {
        System.out.println(customer.getName() + ": " + customer.getAccountSum());
    }
}
