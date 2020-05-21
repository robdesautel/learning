public class Window {
    private Dimensions dimensions;
    private String manufacturer;
    private boolean isOpen;

    public Window(Dimensions dimensions, String manufacturer) {
        this.dimensions = dimensions;
        this.manufacturer = manufacturer;
    }

    public Dimensions getDimensions() {
        return dimensions;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setOpen(boolean status){
        isOpen = status;
    }

    public boolean isOpen() {
        if(isOpen){
            System.out.println("Window is Open");
        }else {
            System.out.println("Window is Closed");
        }

        return isOpen;
    }
}
