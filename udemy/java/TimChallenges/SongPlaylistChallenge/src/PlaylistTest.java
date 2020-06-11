import static org.junit.jupiter.api.Assertions.*;

class PlaylistTest {


    @org.junit.jupiter.api.Test
    void addAlbumToPlaylist(){
        Song today = new Song("Today", 2.56);
        Song tomorrow = new Song("Tomorrow", 3.51);
        Song yesterday = new Song("Yesterday", 1.56);
        Song nextWeek = new Song("Next Week", 5.30);
        Album lifeAlbum = new Album("Life's Journey");
        Album startAlbum = new Album("The Beginning");
        lifeAlbum.addNewSong(today);
        lifeAlbum.addNewSong(tomorrow);
        lifeAlbum.addNewSong(yesterday);
        lifeAlbum.addNewSong(nextWeek);
        Playlist playlist = new Playlist("Travel List");

        //New album will be added to playlist
        assertTrue(playlist.addNewAlbum(lifeAlbum));
        //will not add an album object without a song object
        assertFalse(playlist.addNewAlbum(startAlbum));
        //will not add a duplicate album
        assertFalse(playlist.addNewAlbum(lifeAlbum));
    }

    @org.junit.jupiter.api.Test
    void addSongToAlbumInPlaylist(){
        Song today = new Song("Today", 2.56);
        Song tomorrow = new Song("Tomorrow", 3.51);
        Song yesterday = new Song("Yesterday", 1.56);
        Song nextWeek = new Song("Next Week", 5.30);
        Album lifeAlbum = new Album("Life's Journey");
        lifeAlbum.addNewSong(today);
        lifeAlbum.addNewSong(tomorrow);
        lifeAlbum.addNewSong(yesterday);
        lifeAlbum.addNewSong(nextWeek);
        Playlist playlist = new Playlist("Travel List");

        //New album will be added to playlist
        assertTrue(playlist.addNewAlbum(lifeAlbum));

        //Adding new song to the album on the playlist
        Song anotherMonth = new Song("New Month", 1.23);
        assertTrue(playlist.addSongToAlbum("Life's Journey", anotherMonth));
    }

    @org.junit.jupiter.api.Test
    void modifyExistingSongInPlaylist(){

        Song today = new Song("Today", 2.56);
        Song tomorrow = new Song("Tomorrow", 3.51);
        Song yesterday = new Song("Yesterday", 1.56);
        Song nextWeek = new Song("Next Week", 5.30);
        Album lifeAlbum = new Album("Life's Journey");
        lifeAlbum.addNewSong(today);
        lifeAlbum.addNewSong(tomorrow);
        lifeAlbum.addNewSong(yesterday);
        lifeAlbum.addNewSong(nextWeek);
        Playlist playlist = new Playlist("Travel List");
        playlist.addNewAlbum(lifeAlbum);

        //Change song duration not title
        assertTrue(playlist.updateAlbum(lifeAlbum, today, 1.38));

        //Change song title on an album
        assertTrue(playlist.updateAlbum(lifeAlbum, today, "Yesterday's Tomorrow"));

        //Change song title and duration
        assertTrue(playlist.updateAlbum(lifeAlbum, tomorrow, "Next Day", 3.52));

    }

    @org.junit.jupiter.api.Test
    void removeExistingSongInPlaylist() {

        Song today = new Song("Today", 2.56);
        Song tomorrow = new Song("Tomorrow", 3.51);
        Song yesterday = new Song("Yesterday", 1.56);
        Song nextWeek = new Song("Next Week", 5.30);
        Album lifeAlbum = new Album("Life's Journey");
        lifeAlbum.addNewSong(today);
        lifeAlbum.addNewSong(tomorrow);
        lifeAlbum.addNewSong(yesterday);
        lifeAlbum.addNewSong(nextWeek);
        Playlist playlist = new Playlist("Travel List");
        playlist.addNewAlbum(lifeAlbum);

        assertTrue(playlist.removeSongFromAlbum(lifeAlbum, yesterday));
    }
    @org.junit.jupiter.api.Test
    void removeExistingAlbumInPlaylist() {

        Song today = new Song("Today", 2.56);
        Song tomorrow = new Song("Tomorrow", 3.51);
        Song yesterday = new Song("Yesterday", 1.56);
        Song nextWeek = new Song("Next Week", 5.30);
        Album lifeAlbum = new Album("Life's Journey");
        lifeAlbum.addNewSong(today);
        lifeAlbum.addNewSong(tomorrow);
        lifeAlbum.addNewSong(yesterday);
        lifeAlbum.addNewSong(nextWeek);
        Playlist playlist = new Playlist("Travel List");
        playlist.addNewAlbum(lifeAlbum);

        assertTrue(playlist.removeAlbum(lifeAlbum));
    }


}