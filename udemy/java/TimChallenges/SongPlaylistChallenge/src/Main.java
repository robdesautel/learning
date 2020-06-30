import java.util.LinkedList;
import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);
    private static LinkedList<Playlist> myPlaylist;
    public static void main(String[] args) {
        mainMenu();
    }
    private static void mainMenu(){
        System.out.println("Select an option from the menu.");
        System.out.println("1 - Open playlist\n" +
                            "2 - Add a playlist\n" +
                            "3 - Remove album from playlist\n" +
                            "4 - Modify album in playlist\n" +
                            "5 - Delete album in playlist\n" +
                            "6 - Quit\r");
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
                        removeAlbum();
                        break;
                    case 4:
                        modifyAlbum();
                        break;
                    case 5:
                        deleteAlbum();
                        break;
                    case 6:
                        System.out.println("exiting playlist.");
                        break;
                    default:
                        System.out.print("Please enter a valid number\n\r");
                        break;
                }
            }
        }while (userInput != 6);
    }

    private static void deleteAlbum() {

    }

    private static void modifyAlbum() {
    }

    private static void removeAlbum() {

    }

    private static void addPlaylist() {

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
        }

    }

    private static void playlistMenu(){

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

