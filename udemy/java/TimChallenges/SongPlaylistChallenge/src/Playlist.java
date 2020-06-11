import java.util.ArrayList;
import java.util.ListIterator;

public class Playlist {
    private String name;
    private ArrayList<Album> albums;

    public Playlist(String name) {
        this.name = name;
        this.albums = new ArrayList<>();
    }

    public boolean createNewAlbum(Album album){
        ListIterator albumIterator = this.albums.listIterator();
        if (findAlbum(album) < 0){
            albumIterator.add(album);
            return true;
        }
        return false;
    }

    public void addSongToAlbum(Album album){
        ListIterator albumIterator = this.albums.listIterator();
        int existingAlbum = findAlbum(album);
        if (existingAlbum < 0){
            albumIterator.add(album);
        }
    }

    private Album findAlbum(String albumName) {
        for(Album album: this.albums){
            if(album.getAlbumName().equals(albumName)){
                return album;
            }
        }
        return null;
    }

    private int findAlbum(Album album) {
        return this.albums.indexOf(album);
    }
}
