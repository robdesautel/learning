public class Furniture {
    private Dimensions dimensions;
    private String color;
    private String location;
    private String manufacturere;
    private int drawers;

    public Furniture(Dimensions dimensions, String color, String location, String manufacturere, int drawers) {
        this.dimensions = dimensions;
        this.color = color;
        this.location = location;
        this.manufacturere = manufacturere;
        this.drawers = drawers;
    }

    public void openDrawer(){
        System.out.println("Drawer is open");
    }

    public void closeDrawer(){
        System.out.println("Drawer is closed");
    }

    public void makeBed(){
        System.out.println("Bed is made");
    }

    public Dimensions getDimensions() {
        return dimensions;
    }

    public String getColor() {
        return color;
    }

    public String getLocation() {
        return location;
    }

    public String getManufacturere() {
        return manufacturere;
    }

    public int getDrawers() {
        return drawers;
    }
}
