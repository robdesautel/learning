import static org.junit.jupiter.api.Assertions.*;

class PlaylistTest {

    @org.junit.jupiter.api.Test
    void createNewAlbumInPlaylist(){
        Playlist playlist = new Playlist("Travel List");

        assertTrue(playlist.createNewAlbum("Life's Journey"));

    }

    @org.junit.jupiter.api.Test
    void addSongToAlbumInPlaylist(){
        Playlist playlist = new Playlist("Travel List");
        Album lifeAlbum = new Album("Life's Journey");

        assertTrue(lifeAlbum.addNewSong("Today", 2.56));
        assertTrue(lifeAlbum.addNewSong("Tomorrow", 3.51));
        assertTrue(lifeAlbum.addNewSong("Yesterday", 1.56));
        assertTrue(lifeAlbum.addNewSong("Next Week", 5.30));

        assertTrue(playlist.createNewAlbum("Life's Journey"));
        playlist.addSongToAlbum(lifeAlbum);

    }



}