import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class Playlist {
    private String name;
    private AlbumList albums;

    public Playlist(String name) {
        this.name = name;
        albums = new AlbumList();
    }

    public String getName() {
        return name;
    }

    public List<Album> addAlbum(String albumName){
        return (albums.addNewAlbum(new Album(albumName)));
    }

    public boolean addSongToAlbum(String albumName, String songTitle, double songDuration){
        Album currentAlbum = this.albums.findAlbum(albumName);
        if (currentAlbum != null){
            return currentAlbum.addNewSong(songTitle, songDuration);
        }
        return false;
    }

    public boolean updateAlbum(Album currentAlbum, Song currentSong, String newSongTitle){
        Album album = this.albums.findAlbum(currentAlbum.getAlbumName());
        if(album != null){
            return album.updateSong(currentSong, newSongTitle);
        }
        return false;
    }

    public boolean updateAlbum(Album currentAlbum, Song currentSong, double newSongDuration){
        Album album = this.albums.findAlbum(currentAlbum.getAlbumName());
        if(album != null){
            return album.updateSong(currentSong, newSongDuration);
        }
        return false;
    }

    public boolean updateAlbum(Album currentAlbum, Song currentSong, String newSongTitle, double newSongDuration){
        Album album = this.albums.findAlbum(currentAlbum.getAlbumName());
        if(album != null){
            return album.updateSong(currentSong, newSongTitle, newSongDuration);
        }
        return false;
    }

    public boolean removeSongFromAlbum(Album album, Song song){
        Album existingAlbum = this.albums.findAlbum(album.getAlbumName());
        if(existingAlbum != null){
            return existingAlbum.removeSong(song);
        }
        return false;
    }

    public boolean removeAlbum(String albumName){
        Album existingAlbum = this.albums.findAlbum(albumName);
        if(existingAlbum != null) {
            ListIterator albumIterator = this.albums.getAlbums().listIterator();
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
        if(this.albums.findAlbum(album)) {
            ListIterator albumIterator = this.albums.getAlbums().listIterator();
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

    public List<Album> albums(){
        return this.albums.getAlbums();
    }

    private class AlbumList{
        LinkedList<Album> albums;

        public AlbumList() {
            this.albums = new LinkedList<>();
        }

        private List<Album> addNewAlbum(Album album){
            ListIterator albumIterator = this.albums.listIterator();
            if (!findAlbum(album)){
                albumIterator.add(album);
                return this.albums;
            }
            return null;
        }


        private boolean findAlbum(Album album) {
            return this.albums.contains(album);
        }

        private Album findAlbum(String albumName) {
            for(Album album: this.albums){
                if(album.getAlbumName().equals(albumName)){
                    return album;
                }
            }
            return null;
        }

        private List<Album> getAlbums() {
            return albums;
        }


    }

}
