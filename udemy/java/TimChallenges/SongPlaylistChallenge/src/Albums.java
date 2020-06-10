import java.util.ArrayList;

public class Albums {
    private ArrayList<String>albums;

    public Albums(String albumName) {
        this.albums = new ArrayList<>();
        this.albums.add(albumName);
    }
}
