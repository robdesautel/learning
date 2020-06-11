public class Song {

    private String songTitle;
    private double songDuration;

    public Song(String songTitle, double songDuration) {
        this.songTitle = songTitle;
        this.songDuration = songDuration;

    }

    public String getSongTitle() {
        return songTitle;
    }

    public void setSongTitle(String songTitle){
        this.songTitle = songTitle;
    }

    public void setSongDuration(double songDuration){
        this.songDuration = songDuration;
    }

    public double getSongDuration() {
        return songDuration;
    }

    public static Song createSong(String songTitle, double songDuration){
        return new Song(songTitle, songDuration);
    }
}
