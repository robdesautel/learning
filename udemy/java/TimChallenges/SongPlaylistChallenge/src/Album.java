import java.util.LinkedList;
import java.util.ListIterator;

public class Album {
    private String albumName;
    private LinkedList<Song> songs;

    public Album(String albumName, Song song) {
        this.albumName = albumName;
        this.songs = new LinkedList<>();
        addNewSong(song);
    }

    public void addNewSong(Song song){
        ListIterator songIterator = songs.listIterator();
        if(findSong(song) < 0){
            songIterator.add(song);
        }
    }

    public void updateSong(String oldSongTitle, String newSongTitle){
        Song song = findSong(oldSongTitle);
        song.setSongTitle(newSongTitle);
        songIteratorUpdate(song);
    }

    public void updateSong(String oldSongTitle, double songDuration){
        Song song = findSong(oldSongTitle);
        song.setSongDuration(songDuration);
        songIteratorUpdate(song);
    }

    public void updateSong(String oldSongTitle, String newSongTitle, double songDuration){
        Song song = findSong(oldSongTitle);
        song.setSongTitle(newSongTitle);
        song.setSongDuration(songDuration);
        songIteratorUpdate(song);
    }

    private void songIteratorUpdate(Song song){
        ListIterator songIterator = this.songs.listIterator();
        for(int i = 0; i < this.songs.size(); i++){
            if(i == this.songs.indexOf(song)){
                songIterator.set(song);
            }else {
                songIterator.next();
            }
        }
    }

    public void removeSong(String songTitle){
        Song song = findSong(songTitle);
        ListIterator songIterator = this.songs.listIterator();
        for(int i = 0; i < this.songs.size(); i++){
            if(i == this.songs.indexOf(song)){
                songIterator.remove();
            }else {
                songIterator.next();
            }
        }
    }

    private Song findSong(String songTitle) {
        for(Song song : this.songs){
            if(song.getSongTitle().equals(songTitle)){
                return song;
            }
        }
        return null;
    }

    private int findSong(Song song) {
        return this.songs.indexOf(song);
    }


    public LinkedList<Song> getSongs(){
        return this.songs;
    }

    public String getAlbumName() {
        return albumName;
    }

//    public void setAlbumName(String albumName) {
//        this.albumName = albumName;
//    }
}
