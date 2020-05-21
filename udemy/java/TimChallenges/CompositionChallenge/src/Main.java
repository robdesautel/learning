public class Main {
    public static void main(String[] args) {

         Dimensions chestOfDrawersDimensions = new Dimensions(30, 20, 15);
         Dimensions roomDimensions = new Dimensions(500,600);
         Dimensions bedDimensions = new Dimensions(3,7, 5);
         Dimensions chestDimensions = new Dimensions(10, 15, 5);
         Dimensions windowDimensions = new Dimensions(5,7);

         Furniture chestOfDrawers = new Furniture(chestOfDrawersDimensions,
                 "brown",
                 "wall",
                 "Ashley",
                 5);
         Furniture bed = new Furniture(bedDimensions,
                 "White",
                 "Wall",
                 "Ashley",
                 0);
         Furniture chest = new Furniture(chestDimensions,
                 "brown",
                 "wall",
                 "Ashley",
                 3);

         Room bedroom = new Room(roomDimensions, bed, chest, chestOfDrawers, "Bedroom", new Window(windowDimensions, "Winner"));

         bedroom.cleanBed();

         bedroom.pushDrawerClose();

         bedroom.pullDrawerOpen();

         bedroom.openWindow();

         bedroom.windowStatus();

         bedroom.closeWindow();

         bedroom.windowStatus();


    }
}
