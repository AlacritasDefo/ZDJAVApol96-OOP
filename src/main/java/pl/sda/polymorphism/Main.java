package pl.sda.polymorphism;

public class Main {

    public static void main(String... args) {
        SocialMediaPortal portal1 = new Facebook();
        SocialMediaPortal portal2 = new Twitter();

        portal1.announce();
        portal2.announce();
    }
}
