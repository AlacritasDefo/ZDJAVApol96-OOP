package pl.sda.interfaces;

public class Main {
    public static void main(String[] args) {
        MediaPlayer mediaPlayer1 = new WindowsMediaPlayer();
        MediaPlayer mediaPlayer2 = new Winamp();

        mediaPlayer1.play();
        mediaPlayer1.stop();
        mediaPlayer2.play();
        mediaPlayer2.stop();
    }
}