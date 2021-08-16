package pl.sda.inheritance;


public class VipCustomer extends Customer {


    private String status = "VIP";

    public VipCustomer(String name) {
        super(name);
    }

    public String getStatus() {
        return status;
    }

    public void withDraw(float amount){

        accountSum -= amount;

    }


}
