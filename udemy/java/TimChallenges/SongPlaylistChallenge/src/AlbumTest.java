import static org.junit.jupiter.api.Assertions.*;

class AlbumTest {

    @org.junit.jupiter.api.Test
    void addSongToNewAlbum(){

        Album lifeAlbum = new Album("Life's Journey");
        Song today = new Song("Today", 2.56);

        lifeAlbum.addNewSong(today);

        //does not add a duplicate song title
        lifeAlbum.addNewSong(today);
    }

    @org.junit.jupiter.api.Test
    void removeSongFromAlbum(){

        Album lifeAlbum = new Album("Life's Journey");

        Song today = new Song("Today", 2.56);
        Song tomorrow = new Song("Tomorrow", 3.51);
        Song yesterday = new Song("Yesterday", 1.56);
        Song nextWeek = new Song("Next Week", 5.30);

        lifeAlbum.addNewSong(today);
        lifeAlbum.addNewSong(tomorrow);
        lifeAlbum.addNewSong(yesterday);
        lifeAlbum.addNewSong(nextWeek);

        lifeAlbum.removeSong(nextWeek);
        assertEquals(3, lifeAlbum.getSongs().size());
    }

    @org.junit.jupiter.api.Test
    void updateSongFromAlbum(){

        Album lifeAlbum = new Album("Life's Journey");

        Song today = new Song("Today", 2.56);
        Song tomorrow = new Song("Tomorrow", 3.51);
        Song yesterday = new Song("Yesterday", 1.56);
        Song nextWeek = new Song("Next Week", 5.30);


        //update the song Title
        lifeAlbum.updateSong("Next Week", "Last Week");
        //update the duration of the song
        lifeAlbum.updateSong("Last Week", 3.62);
        //update the duration of the song and the song title
        lifeAlbum.updateSong("Last Week", "New Week", 2.03);
    }



}