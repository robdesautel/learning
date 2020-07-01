
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.Scanner;

public class Main {
    private static Scanner scanner;
    private static Playlist playlist;
    private static Song song;
    private static Album album;
    private static LinkedList<Playlist> myPlaylist;

    public static void main(String[] args) {
        mainMenu();
    }

    private static void mainMenu(){
        scanner = new Scanner(System.in);
        System.out.println("Select an option from the menu.");
        System.out.println("1 - Open playlist\n" +
                            "2 - Add a playlist\n" +
                            "3 - Quit\r");
        int userInput = 0;
        while (userInput != 3) {
            userInput = scanner.nextInt();
            switch (userInput) {
                case 1:
                    openPlaylist();
                    break;
                case 2:
                    addPlaylist();
                    break;
                case 3:
                    System.out.println("exiting playlist");
                    break;
                default:
                    System.out.print("Please enter a valid number\n\r");
                    break;
            }
        }
    }

    private static void addPlaylist() {
        scanner = new Scanner(System.in);
        System.out.println("Enter your playlist name");
        String myPlaylistName = scanner.nextLine();
        playlist = new Playlist(myPlaylistName);
        myPlaylist = new LinkedList<>();
        myPlaylist.add(playlist);
        playlistMenu(playlist);
    }

    private static void openPlaylist() {
        System.out.println("Enter a playlist name to view");
        String playlistName = scanner.next();
        if(findPlaylist(playlistName) == null){
            mainMenu();
            return;
        }

        for(Playlist playlist : myPlaylist){
            System.out.println(playlist.getName());
            playlistMenu(playlist);
        }

    }

    private static void playlistMenu(Playlist playlist){
        System.out.println("Select what you want to do with the playlist");
        System.out.println("1 - Add a album\n" +
                            "2 - Remove album\n" +
                            "3 - Modify album\n" +
                            "4 - Quit\r");

        int userInput = 0;
        while (userInput != 4 ) {
            userInput = scanner.nextInt();
            switch (userInput) {
                case 1:
                    addAlbum(playlist);
                    break;
                case 2:
                    removeAlbum(playlist);
                    break;
                case 3:
                    modifyAlbum(playlist);
                    break;
                case 4:
                    System.out.println("finished adding albums");
                    break;
                default:
                    System.out.print("Please enter a valid number\n\r");
                    break;
            }
        }
        mainMenu();
    }

    private static void addAlbum(Playlist playlist) {
        scanner = new Scanner(System.in);
        System.out.println("Enter album name");
        String albumName = scanner.nextLine();
        System.out.println("Add new song to album");
        String songName = scanner.nextLine();
        System.out.println("Duration of song");
        double songDuration = scanner.nextDouble();

        album = new Album(albumName);
        song = new Song(songName, songDuration);
        playlist.addNewAlbum(album);
        playlist.addSongToAlbum(albumName, song);
        playlistMenu(playlist);
    }

    private static void removeAlbum(Playlist playlist) {
        scanner = new Scanner(System.in);
        System.out.println("Enter album name to remove");
        String albumName = scanner.nextLine();
        if(!playlist.removeAlbum(albumName)){
            System.out.println("Album " + albumName + " does not exist");
        }else{
            System.out.println("Album " + albumName + " has been removed");
        }
        playlistMenu(playlist);
    }


    private static void modifyAlbum(Playlist playlist) {
        scanner = new Scanner(System.in);
        System.out.println("Which album would you like to edit");
        int index = 1;
        for(Album album : playlist.getAlbums()){
            System.out.print( index + " " + album.getAlbumName());
            index++;
        }
        int albumIndex = scanner.nextInt();
        Album album = playlist.getAlbums().get(albumIndex);
        albumMenu(album);
    }


    private static void albumMenu(Album album){
        scanner = new Scanner(System.in);
        System.out.println("What would like to modify with this album?\n" +
                            "1 - Edit album name\n" +
                            "2 - Edit song name\n" +
                            "3 - Edit song duration\n" +
                            "4 - Remove song from album\n" +
                            "5 - Quit");
        int userInput = 0;
        while (userInput != 5){
            userInput = scanner.nextInt();
            switch (userInput){
                case 1:
                    editAlbumName(album);
                    break;
                case 2:
                    editSongName(album);
                    break;
                case 3:
                    editSongDuration(album);
                    break;
                case 4:
                    removeSong(album);
                case 5:
                    System.out.println("Completed editing Album");
                    break;
                default:
                    System.out.println("Please select a valid entry");
                    break;
            }
        }
        mainMenu();
    }

    private static void removeSong(Album album) {
        scanner = new Scanner(System.in);
        System.out.println("Which song would you like to remove.");
        int index = 1;
        for(Song song : album.getSongs()){
            System.out.println(index + " " + song.getSongTitle() + ": " + song.getSongDuration());
        }
        int userInput = scanner.nextInt();
        Song song = album.getSongs().get(userInput);
        album.removeSong(song);
    }

    private static void editSongDuration(Album album) {
        scanner = new Scanner(System.in);
        System.out.println("Which song would you like to edit.");
        int index = 1;
        for(Song song : album.getSongs()){
            System.out.println(index + " " + song.getSongTitle() + ": " + song.getSongDuration());
        }
        int userInput = scanner.nextInt();
        Song song = album.getSongs().get(userInput);
        System.out.println("New song duration");
        double newSongDuration = scanner.nextDouble();
        song.setSongDuration(newSongDuration);
        System.out.println(index + " " + song.getSongTitle() + ": " + song.getSongDuration());

    }

    private static void editSongName(Album album) {
        scanner = new Scanner(System.in);
        System.out.println("Which song would you like to edit.");
        int index = 1;
        for(Song song : album.getSongs()){
            System.out.println(index + " " + song.getSongTitle() + ": " + song.getSongDuration());
        }
        int userInput = scanner.nextInt();
        Song song = album.getSongs().get(userInput);
        System.out.println("New song title");
        String newSongTitle = scanner.nextLine();
        song.setSongTitle(newSongTitle);
        System.out.println(index + " " + song.getSongTitle() + ": " + song.getSongDuration());
    }

    private static void editAlbumName(Album album) {
        scanner = new Scanner(System.in);
        String newAlbumName = scanner.nextLine();
        album.setAlbumName(newAlbumName);
        albumMenu(album);
    }

    private static Playlist findPlaylist(String name){
        try {
            for(Playlist playlist: myPlaylist){
                if(playlist.getName().toLowerCase().contains(name.toLowerCase())){
                    return playlist;
                }
            }
        }catch (NullPointerException e){
            System.out.println("A playlist does not exist. Create one from the main menu.");
        }
        return null;
    }

}

