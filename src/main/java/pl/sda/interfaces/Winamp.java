package pl.sda.interfaces;

public class Winamp implements MediaPlayer {

    @Override
    public void stop() {
        System.out.println("Stopped playing");
    }

    @Override
    public void play() {
        System.out.println("Started playing");
    }
}