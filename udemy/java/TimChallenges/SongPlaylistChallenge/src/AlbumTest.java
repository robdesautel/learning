import static org.junit.jupiter.api.Assertions.*;

class AlbumTest {

    @org.junit.jupiter.api.Test
    void addSongToNewAlbum(){

        Album lifeAlbum = new Album("Life's Journey");

        assertTrue(lifeAlbum.addNewSong("Today", 2.56));

        //does not add a duplicate song title
        assertFalse(lifeAlbum.addNewSong("Today", 2.56));
    }

    @org.junit.jupiter.api.Test
    void removeSongFromAlbum(){

        Album lifeAlbum = new Album("Life's Journey");

        assertTrue(lifeAlbum.addNewSong("Today", 2.56));
        assertTrue(lifeAlbum.addNewSong("Tomorrow", 3.51));
        assertTrue(lifeAlbum.addNewSong("Yesterday", 1.56));
        assertTrue(lifeAlbum.addNewSong("Next Week", 5.30));

        lifeAlbum.removeSong("Next Week");
        assertEquals(3, lifeAlbum.getSongs().size());
    }

    @org.junit.jupiter.api.Test
    void updateSongFromAlbum(){

        Album lifeAlbum = new Album("Life's Journey");

        assertTrue(lifeAlbum.addNewSong("Today", 2.56));
        assertTrue(lifeAlbum.addNewSong("Tomorrow", 3.51));
        assertTrue(lifeAlbum.addNewSong("Yesterday", 1.56));
        assertTrue(lifeAlbum.addNewSong("Next Week", 5.30));

        //update the song Title
        lifeAlbum.updateSong("Next Week", "Last Week");
        //update the duration of the song
        lifeAlbum.updateSong("Last Week", 3.62);
        //update the duration of the song and the song title
        lifeAlbum.updateSong("Last Week", "New Week", 2.03);
    }



}