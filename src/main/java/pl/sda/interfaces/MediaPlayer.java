package pl.sda.interfaces;

public interface MediaPlayer {
    String name = "MediaPlayer";
    void stop();
    void play();
    default void volumeUp() {
        System.out.println("Volume + 1");
    }
}