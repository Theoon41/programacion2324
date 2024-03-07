package Boletin5_2.ejercicio3;

public class MP3Player implements OfflineMusicPlayer{
    @Override
    public void play() {
        load();
        System.out.println("Playing music on MP3Player");
    }

    @Override
    public void stop() {
        System.out.println("Stopping music on MP3Player");
    }

    @Override
    public void load() {
        System.out.println("Loading music on MP3Player");
    }
}
