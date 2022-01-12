package pl.sda.interfaces;

public class WindowsMediaPlayer implements MediaPlayer {
    @Override
    public void stop(){
        System.out.println("Stopped playing");
    }
    @Override
    public void play(){
        System.out.println("Start playing");
    }
}