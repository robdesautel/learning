import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class PlaylistTest {

    @org.junit.jupiter.api.Test
    void addAlbumToPlaylist(){
        Playlist playlist = new Playlist("Travel List");
        List<Album> albums = playlist.addAlbum("Life's Journey");
        playlist.addSongToAlbum("Life's Journey", "Today", 2.56);
        playlist.addSongToAlbum("Life's Journey", "Tomorrow", 3.25);
        playlist.addSongToAlbum("Life's Journey", "Yesterday", 1.25);
        playlist.addSongToAlbum("Life's Journey", "Next Week", 4.13);

        albums = playlist.addAlbum("New Life");
        playlist.addSongToAlbum("New Life", "Graduated", 2.56);
        playlist.addSongToAlbum("New Life", "Married", 3.25);
        playlist.addSongToAlbum("New Life", "Kids", 1.25);
        playlist.addSongToAlbum("New Life", "College", 4.13);

        for(Album myAlbum : albums){
            System.out.println(myAlbum.getAlbumName());
            for(Song song : myAlbum.getSongs()){
                System.out.println("\t" + song.getSongTitle());
            }
        }
    }

    @org.junit.jupiter.api.Test
    void modifyExistingSongInPlaylist(){
        Playlist playlist = new Playlist("Travel List");
        List<Album> albums = playlist.addAlbum("Life's Journey");
        playlist.addSongToAlbum("Life's Journey", "Today", 2.56);
        playlist.addSongToAlbum("Life's Journey", "Tomorrow", 3.25);
        playlist.addSongToAlbum("Life's Journey", "Yesterday", 1.25);
        playlist.addSongToAlbum("Life's Journey", "Next Week", 4.13);

        //Change song title on an album
        assertTrue(playlist.updateAlbum("Life's Journey", "Today", "Yesterday's Tomorrow"));

        //Change song title and duration
        assertTrue(playlist.updateAlbum("Life's Journey", "Tomorrow", "Next Day", 3.52));

        //Show changes made to the songs.
        for(Album album : albums){
            System.out.println(album.getAlbumName());
            for(Song song : album.getSongs()){
                System.out.println("\t" + song.getSongTitle());
            }
        }
    }

    @org.junit.jupiter.api.Test
    void removeExistingSongInPlaylist() {

        Playlist playlist = new Playlist("Travel List");
        List<Album> albums = playlist.addAlbum("Life's Journey");
        playlist.addSongToAlbum("Life's Journey", "Today", 2.56);
        playlist.addSongToAlbum("Life's Journey", "Tomorrow", 3.25);
        playlist.addSongToAlbum("Life's Journey", "Yesterday", 1.25);
        playlist.addSongToAlbum("Life's Journey", "Next Week", 4.13);

        assertTrue(playlist.removeSongFromAlbum("Life's Journey", "Today"));

        for(Album album : albums){
            System.out.println(album.getAlbumName());
            for(Song song : album.getSongs()){
                System.out.println("\t" + song.getSongTitle());
            }
        }
    }

    @org.junit.jupiter.api.Test
    void removeExistingAlbumInPlaylist() {

        Playlist playlist = new Playlist("Travel List");
        List<Album> albums = playlist.addAlbum("Life's Journey");
        playlist.addSongToAlbum("Life's Journey", "Today", 2.56);
        playlist.addSongToAlbum("Life's Journey", "Tomorrow", 3.25);
        playlist.addSongToAlbum("Life's Journey", "Yesterday", 1.25);
        playlist.addSongToAlbum("Life's Journey", "Next Week", 4.13);

        playlist.removeAlbum("Life's Journey");
    }


}