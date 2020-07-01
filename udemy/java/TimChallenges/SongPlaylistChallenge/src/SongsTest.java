import org.junit.Test;

import java.util.ListIterator;

import static org.junit.jupiter.api.Assertions.*;

class SongsTest {

//    @org.junit.jupiter.api.Test
//    void addOneSong() {
//        assertTrue(this.songs.getSongTitles().isEmpty());
//        assertEquals(0, this.songs.getSongTitles().size());
//
//        songs.addSong("Today", 2);
//        assertFalse(this.songs.getSongTitles().isEmpty());
//        assertEquals(2, this.songs.getSongTitles().size());
//
//    }
//
//    @org.junit.jupiter.api.Test
//    void addDuplicateSongFalse() {
//        songs.addSong("Today", 2);
//        assertFalse(this.songs.getSongTitles().isEmpty());
//        assertEquals(2, this.songs.getSongTitles().size());
//
//        songs.addSong("Today", 2);
//        assertFalse(this.songs.getSongTitles().isEmpty());
//        assertEquals(2, this.songs.getSongTitles().size());
//    }
//
//    @org.junit.jupiter.api.Test
//    void addMultipleSongs() {
//        assertTrue(this.songs.getSongTitles().isEmpty());
//        assertEquals(0, this.songs.getSongTitles().size());
//
//        songs.addSong("Today", 2);
//        assertFalse(this.songs.getSongTitles().isEmpty());
//        assertEquals(1, this.songs.getSongTitles().size());
//        assertEquals(1, this.songs.getDuration().size());
//
//        songs.addSong("Yesterday", 2);
//        assertEquals(2, this.songs.getSongTitles().size());
//        assertEquals(2, this.songs.getDuration().size());
//
//    }
//
//    @org.junit.jupiter.api.Test
//    void removeSong() {
//        assertTrue(this.songs.getSongTitles().isEmpty());
//        assertEquals(0, this.songs.getSongTitles().size());
//
//        songs.addSong("Today", 2);
//        assertFalse(this.songs.getSongTitles().isEmpty());
//        assertEquals(1, this.songs.getSongTitles().size());
//        assertEquals(1, this.songs.getDuration().size());
//
//        songs.addSong("Yesterday", 5);
//        assertEquals(2, this.songs.getSongTitles().size());
//        assertEquals(2, this.songs.getDuration().size());
//
//
//        songs.removeSong("Yesterday");
//        assertEquals(1, this.songs.getSongTitles().size());
//        assertEquals(1, this.songs.getDuration().size());
//    }
//
//    @org.junit.jupiter.api.Test
//    void updateSongTitle() {
//        assertTrue(this.songs.getSongTitles().isEmpty());
//        assertEquals(0, this.songs.getSongTitles().size());
//
//        songs.addSong("Today", 2);
//        assertFalse(this.songs.getSongTitles().isEmpty());
//        assertEquals(1, this.songs.getSongTitles().size());
//        assertEquals(1, this.songs.getDuration().size());
//
//        songs.updateSongTitle("Today", "Good Morning");
//        int songIndex = songs.getSongTitles().indexOf("Good Morning");
//        assertEquals("Good Morning", songs.getSongTitles().get(songIndex));
//
//    }
//
//    @org.junit.jupiter.api.Test
//    void updateSongTitleWithDuration() {
//        assertTrue(this.songs.getSongTitles().isEmpty());
//        assertEquals(0, this.songs.getSongTitles().size());
//
//        songs.addSong("Today", 2);
//        assertFalse(this.songs.getSongTitles().isEmpty());
//        assertEquals(1, this.songs.getSongTitles().size());
//        assertEquals(1, this.songs.getDuration().size());
//
//        songs.updateSongTitle("Today", "Good Morning", 5);
//        int songIndex = songs.getSongTitles().indexOf("Good Morning");
//        assertEquals("Good Morning", songs.getSongTitles().get(songIndex));
//        int durationIndex = songs.getDuration().lastIndexOf(5);
//        assertEquals(5, songs.getDuration().get(durationIndex));
//
//    }
//
//    @org.junit.jupiter.api.Test
//    void updateSongDuration() {
//        assertTrue(this.songs.getSongTitles().isEmpty());
//        assertEquals(0, this.songs.getSongTitles().size());
//
//        songs.addSong("Today", 2);
//        assertFalse(this.songs.getSongTitles().isEmpty());
//        assertEquals(1, this.songs.getSongTitles().size());
//        assertEquals(1, this.songs.getDuration().size());
//
//        songs.updateSongTitle("Today", 5);
//        int songIndex = songs.getSongTitles().indexOf("Today");
//        assertEquals("Today", songs.getSongTitles().get(songIndex));
//        int durationIndex = songs.getDuration().lastIndexOf(5);
//        assertEquals(5, songs.getDuration().get(durationIndex));
//    }
}