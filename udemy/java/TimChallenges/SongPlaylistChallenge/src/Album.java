
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class Album {
    private String albumName;
    private SongList songs;

    public Album(String albumName) {
        this.albumName = albumName;
        this.songs = new SongList();
    }
    public boolean addNewSong(String songTitle, double songDuration){
        return this.songs.add(new Song(songTitle, songDuration));
    }

    public boolean updateSong(String songTitle, String newSongTitle){
         Song song = songs.findSong(songTitle);
         if(song != null){
             song.setSongTitle(newSongTitle);
             return true;
         }
         return false;
    }

    public boolean updateSong(String songTitle, double songDuration){
        Song song = songs.findSong(songTitle);
        if(song != null){
            song.setSongDuration(songDuration);
            return true;
        }
        return false;
    }

    public boolean updateSong(String songTitle, String newSongTitle, double songDuration){
        Song song = songs.findSong(songTitle);
        if(song != null) {
            song.setSongTitle(newSongTitle);
            song.setSongDuration(songDuration);
            return true;
        }
        return false;
    }

    public boolean removeSong(String songTitle){
        Song existingSong = songs.findSong(songTitle);
        if(existingSong != null) {
            ListIterator songIterator = songs.songs.listIterator();
            int i = 0;
            while (songIterator.hasNext()) {
                Song nextSong = (Song) songIterator.next();
                if (nextSong.getSongTitle().equals(songTitle)) {
                    songIterator.remove();
                    return true;
                }
                i++;
            }
        }
        return false;
    }

    public void removeSong(List<Song> songs){
        ListIterator songIterator = songs.listIterator();
        while (songIterator.hasNext()) {
            Song nextSong = (Song) songIterator.next();
            for(Song song: songs){
                if (nextSong.getSongTitle().equals(song.getSongTitle())) {
                    songIterator.remove();
                    break;
                }
            }
        }
    }


    public LinkedList<Song> getSongs(){
        return songs.getSongs();
    }
    public String getAlbumName() {
        return albumName;
    }

    public void setAlbumName(String albumName) {
        this.albumName = albumName;
    }

    private class SongList{
        private LinkedList<Song> songs;

        public SongList() {
            songs = new LinkedList<>();
        }

        public boolean add(Song song){
            if(songs.contains(song)){
                return false;
            }
            this.songs.add(song);
            return true;
        }

        private Song findSong(String songTitle) {
            for(Song song : this.songs){
                if(song.getSongTitle().equals(songTitle)){
                    return song;
                }
            }
            return null;
        }

        private Song findSong(Song song) {
            if(this.songs.contains(song)){
                return song;
            }
            return null;
        }
        private LinkedList<Song> getSongs(){
            return this.songs;
        }


    }
}
