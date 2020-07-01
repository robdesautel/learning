import org.w3c.dom.ls.LSOutput;

import java.util.LinkedList;
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
        do {
            if(scanner.hasNext()) {
                userInput = scanner.nextInt();
                switch (userInput) {
                    case 1:
                        openPlaylist();
                        break;
                    case 2:
                        addPlaylist();
                        break;
                    case 3:
                        System.out.println("exiting playlist.");
                        return;
                    default:
                        System.out.print("Please enter a valid number\n\r");
                        break;
                }
            }
        }while (userInput != 5);
    }

    private static void removeAlbum(Playlist playlist) {
        scanner = new Scanner(System.in);
        System.out.println("Enter album name to remove");
        String albumName = scanner.nextLine();
        if(!playlist.removeAlbum(albumName)){
            System.out.println("Album " + albumName + " does not exist");
            return;
        }
        System.out.println("Album " + albumName + " has been removed");
    }


    private static void modifyAlbum() {
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
                            "4 - Delete album\n" +
                            "5 - Quit\r");

        int userInput = 0;
        do {
            if(scanner.hasNextInt()) {
                userInput = scanner.nextInt();
                switch (userInput) {
                    case 1:
                        addAlbum(playlist);
                        break;
                    case 2:
                        removeAlbum(playlist);
                        break;
                    case 3:
                        modifyAlbum();
                        break;
                    case 5:
                        System.out.println("exiting playlist.");
                        return;
                    default:
                        System.out.print("Please enter a valid number\n\r");
                        break;
                }
            }
        }while (userInput != 6);

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

    private static void albumMenu(){

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

