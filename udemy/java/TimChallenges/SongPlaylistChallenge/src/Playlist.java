import java.util.ArrayList;
import java.util.ListIterator;

public class Playlist {
    private String name;
    private ArrayList<Album> albums;

    public Playlist(String name) {
        this.name = name;
        this.albums = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public boolean addNewAlbum(Album album){
        ListIterator albumIterator = this.albums.listIterator();
        if (findAlbum(album) == null && album.getSongs().size() <= 0){
            albumIterator.add(album);
            return true;
        }
        return false;
    }

    public boolean addSongToAlbum(String albumName, Song song){
        ListIterator albumIterator = this.albums.listIterator();
        Album existingAlbum = findAlbum(albumName);
        if (existingAlbum != null){
            existingAlbum.addNewSong(song);
            albumIterator.add(existingAlbum);
            return true;
        }
        return false;
    }

    public boolean updateAlbum(Album currentAlbum, Song currentSong, String newSongTitle){
        Album album = findAlbum(currentAlbum.getAlbumName());
        if(album != null){
            return album.updateSong(currentSong, newSongTitle);
        }
        return false;
    }

    public boolean updateAlbum(Album currentAlbum, Song currentSong, double newSongDuration){
        Album album = findAlbum(currentAlbum.getAlbumName());
        if(album != null){
            return album.updateSong(currentSong, newSongDuration);
        }
        return false;
    }

    public boolean updateAlbum(Album currentAlbum, Song currentSong, String newSongTitle, double newSongDuration){
        Album album = findAlbum(currentAlbum.getAlbumName());
        if(album != null){
            return album.updateSong(currentSong, newSongTitle, newSongDuration);
        }
        return false;
    }

    public boolean removeSongFromAlbum(Album album, Song song){
        Album existingAlbum = findAlbum(album.getAlbumName());
        if(existingAlbum != null){
            return existingAlbum.removeSong(song);
        }
        return false;
    }


    public boolean removeAlbum(String albumName){
        Album existingAlbum = findAlbum(albumName);
        if(existingAlbum != null) {
            ListIterator albumIterator = this.albums.listIterator();
            int i = 0;
            while (albumIterator.hasNext()) {
                Album x = (Album) albumIterator.next();
                if (x.getAlbumName().equals(albumName)) {
                    albumIterator.remove();
                    return true;
                }
                i++;
            }
        }
        return false;
    }


    public boolean removeAlbum(Album album){
        Album existingAlbum = findAlbum(album);
        if(existingAlbum != null) {
            ListIterator albumIterator = this.albums.listIterator();
            int i = 0;
            while (albumIterator.hasNext()) {
                Album x = (Album) albumIterator.next();
                if (x.getAlbumName().equals(album.getAlbumName())) {
                    albumIterator.remove();
                    return true;
                }
                i++;
            }
        }
        return false;
    }


    private Album findAlbum(String albumName) {
        for(Album album: this.albums){
            if(album.getAlbumName().equals(albumName)){
                return album;
            }
        }
        return null;
    }

    public ArrayList<Album> getAlbums() {
        return albums;
    }

    private Album findAlbum(Album album) {
        if(this.albums.contains(album)){
            return album;
        }
        return null;
    }

}
