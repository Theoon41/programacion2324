package Boletin5_2.ejercicio3;

public class MusicApp {
    public static void main(String[] args) {
        MusicPlayer[] players = {new Spotify(), new MP3Player(), new iTunes()};
        startMusic(players);
    }
    public static void startMusic(MusicPlayer[] players){
        for (int i = 0; i < players.length; i++){
            players[i].play();
            players[i].stop();
        }
    }
}
