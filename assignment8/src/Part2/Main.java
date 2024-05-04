package Part2;

public class Main {
    public static void main(String[] args) {
        Playlist playlist = new PlaylistImpl();

        playlist.addSong(new Song("I wanna be yours", "Arctic Monkeys"));
        playlist.addSong(new Song("Agora Hills", "Doja Cat"));
        playlist.addSong(new Song("She", "Tyler, The Creator"));

        Iterator iterator = playlist.createIterator();
        while (iterator.hasNext()) {
            Song song = iterator.next();
            System.out.println("Playing: " + song.getTitle() + " by " + song.getArtist());
        }
    }
}
