package pl.sda.polymorphism;

public class Twitter extends SocialMediaPortal {
    @Override
    public void announce() {
        System.out.println("Tweet");
    }
}