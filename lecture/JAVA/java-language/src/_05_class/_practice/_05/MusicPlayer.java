package _05_class._practice._05;

public class MusicPlayer {

    public static void main(String[] args) {
        // Create Mp3Player and CdPlayer objects
        _05_class._practice._05.Music mp3Player = new _05_class._practice._05.Mp3Player();
        _05_class._practice._05.Music cdPlayer = new _05_class._practice._05.CdPlayer();

        // Use Mp3Player to play and stop music
        System.out.println("=== MP3 Player ===");
        mp3Player.play("아이유 블루밍");
        mp3Player.stop("아이유 블루밍");

        System.out.println();

        // Use CdPlayer to play and stop music
        System.out.println("=== CD Player ===");
        cdPlayer.play("아이유 꽃갈피");
        cdPlayer.stop("아이유 꽃갈피");
    }
}
