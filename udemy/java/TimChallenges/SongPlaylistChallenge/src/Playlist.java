import sun.awt.image.ImageWatched;

import java.util.ArrayList;
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
    public boolean addAlbum(Album album){
        return albums.addNewAlbum(new Album(album.getAlbumName()));
    }

    public boolean addSongToAlbum(String albumName, Song song){
        ListIterator albumIterator = this.albums.getAlbums().listIterator();
        Album existingAlbum = this.albums.findAlbum(albumName);
        if (existingAlbum != null && existingAlbum.addNewSong(song)){
            albumIterator.add(existingAlbum);
            return true;
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
        Album existingAlbum = this.albums.findAlbum(album);
        if(existingAlbum != null) {
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

        private boolean addNewAlbum(Album album){
            ListIterator albumIterator = this.albums.listIterator();
            if (findAlbum(album) == null && album.getSongs().size() <= 0){
                albumIterator.add(album);
                return true;
            }
            return false;
        }


        private Album findAlbum(Album album) {
            if(this.albums.contains(album)){
                return album;
            }
            return null;
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
