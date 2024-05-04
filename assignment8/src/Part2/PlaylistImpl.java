package Part2;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class PlaylistImpl implements Playlist{
    private List<Song> songs;

    public PlaylistImpl() {
        this.songs = new ArrayList<>();
    }

    @Override
    public Iterator createIterator() {
        return new PlaylistIterator();
    }

    @Override
    public void addSong(Song song) {
        songs.add(song);
    }

    private class PlaylistIterator implements Iterator {
        private int position;

        public PlaylistIterator() {
            this.position = 0;
        }

        @Override
        public boolean hasNext() {
            return position < songs.size();
        }

        @Override
        public Song next() {
            if (this.hasNext()) {
                return songs.get(position++);
            }
            return null;
        }
    }
}
