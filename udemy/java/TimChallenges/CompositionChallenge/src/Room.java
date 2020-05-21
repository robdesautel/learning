public class Room{
    private Dimensions dimensions;
    private Furniture bed;
    private Furniture dresser;
    private Furniture chestOfDrawers;
    private String name;
    private Window window;

    public Room(Dimensions dimensions,
                Furniture bed,
                Furniture dresser,
                Furniture chestOfDrawers,
                String name,
                Window window) {
        this.dimensions = dimensions;
        this.bed = bed;
        this.dresser = dresser;
        this.chestOfDrawers = chestOfDrawers;
        this.name = name;
        this.window = window;
    }

    public void closeWindow(){
        window.setOpen(false);
    }

    public void openWindow(){
        window.setOpen(true);
    }

    public void windowStatus(){
        window.isOpen();
    }

    public void pushDrawerClose(){
        dresser.closeDrawer();
    }

    public void pullDrawerOpen(){
        dresser.openDrawer();
    }

    public void cleanBed(){
        bed.makeBed();
    }
    public Dimensions getDimensions() {
        return dimensions;
    }

    public String getName() {
        return name;
    }
}
