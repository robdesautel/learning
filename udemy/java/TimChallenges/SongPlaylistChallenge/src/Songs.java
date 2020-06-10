import java.util.LinkedList;

public class Songs {
    private LinkedList<String> songTitles;
    private LinkedList<Integer>duration;

    public Songs() {
        this.songTitles = new LinkedList<>();
        this.duration = new LinkedList<>();
    }

    public void addSong(String songTitle, int duration){
        if(!this.songTitles.contains(songTitle)){
            if (this.songTitles.isEmpty()){
                this.songTitles = new LinkedList<>();
            }
            this.songTitles.add(songTitle);
            addDuration(this.songTitles.indexOf(songTitle), duration);
        }
    }

    private void addDuration(int songTitleIndex, int songDuration){
        this.duration.add(songTitleIndex, songDuration);
    }

    public void updateSongTitle(String currentSongTitle, String newSongTitle){
        if(this.songTitles.contains(currentSongTitle)){
            int songIndex = this.songTitles.indexOf(currentSongTitle);
            this.songTitles.set(songIndex, newSongTitle);
        }
    }

    public void updateSongTitle(String currentSongTitle, String newSongTitle, int newDuration){
        if(this.songTitles.contains(currentSongTitle)){
            int songIndex = this.songTitles.indexOf(currentSongTitle);
            this.songTitles.set(songIndex, newSongTitle);
            this.duration.set(songIndex, newDuration);
        }
    }

    public void updateSongTitle(String SongTitle, int newDuration){
        if(this.songTitles.contains(SongTitle)){
            int songIndex = this.songTitles.indexOf(SongTitle);
            this.duration.set(songIndex, newDuration);
        }
    }

    public void removeSong(String songTitle){
        if(this.songTitles.contains((songTitle))){
            int songIndex = this.songTitles.indexOf(songTitle);
            this.songTitles.remove((songTitle));
            this.duration.remove(songIndex);

        }
    }

    public LinkedList<String> getSongTitles(){
        return this.songTitles;
    }
    public LinkedList<Integer> getDuration(){
        return this.duration;
    }
}
