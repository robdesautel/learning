import java.util.LinkedList;
import java.util.ListIterator;

public class Album {
    private String albumName;
    private LinkedList<Song> songs;

    public Album(String albumName) {
        this.albumName = albumName;
        this.songs = new LinkedList<>();
    }

    public void addNewSong(Song song){
        ListIterator songIterator = songs.listIterator();
        Song existingSong = findSong(song);
        if(existingSong == null){
            songIterator.add(song);
        }
    }
    public boolean updateSong(Song currentSong, String newSongTitle){
         Song song = findSong(currentSong.getSongTitle());
         if(song != null){
             song.setSongTitle(newSongTitle);
             return true;
         }
         return false;
    }

    public boolean updateSong(Song currentSong, double songDuration){
        Song song = findSong(currentSong.getSongTitle());
        if(song != null){
            song.setSongDuration(songDuration);
            return true;
        }
        return false;
    }

    public boolean updateSong(Song currentSong, String newSongTitle, double songDuration){
        Song song = findSong(currentSong.getSongTitle());
        if(song != null) {
            song.setSongTitle(newSongTitle);
            song.setSongDuration(songDuration);
            return true;
        }
        return false;
    }

    public void updateSong(String oldSongTitle, String newSongTitle){
        Song song = findSong(oldSongTitle);
        song.setSongTitle(newSongTitle);
    }

    public void updateSong(String oldSongTitle, double songDuration){
        Song song = findSong(oldSongTitle);
        song.setSongDuration(songDuration);
    }

    public void updateSong(String oldSongTitle, String newSongTitle, double songDuration){
        Song song = findSong(oldSongTitle);
        song.setSongTitle(newSongTitle);
        song.setSongDuration(songDuration);
    }

    public boolean removeSong(Song song){
        Song existingSong = findSong(song);
        if(existingSong != null) {
            ListIterator songIterator = this.songs.listIterator();
            int i = 0;
            while (songIterator.hasNext()) {
                Song x = (Song) songIterator.next();
                if (x.getSongTitle().equals(song.getSongTitle())) {
                    songIterator.remove();
                    return true;
                }
                i++;
            }
        }
        return false;
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

    public LinkedList<Song> getSongs(){
        return this.songs;
    }

    public String getAlbumName() {
        return albumName;
    }

    public void setAlbumName(String albumName) {
        this.albumName = albumName;
    }
}
