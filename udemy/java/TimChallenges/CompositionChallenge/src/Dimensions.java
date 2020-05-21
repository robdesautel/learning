public class Dimensions {
    private double height;
    private double length;
    private double width;
    private double radius;

    public Dimensions(double height, double length) {
        this(height, length, 0, 0);
    }

    public Dimensions(double height, double length, double width) {
        this(height, length, width, 0);
    }

    public Dimensions(double radius) {
        this(0,0,0,radius);
    }


    public Dimensions(double height, double length, double width, double radius) {
        if(height < 0 && length < 0 && width < 0 && radius < 0){
            this.height = 0;
            this.length = 0;
            this.width = 0;
            this.radius = 0;
        } else {
            this.height = height;
            this.length = length;
            this.width = width;
            this.radius = radius;
        }
    }

    public double getHeight() {
        return height;
    }

    public double getLength() {
        return length;
    }

    public double getWidth() {
        return width;
    }

    public double getRadius() {
        return radius;
    }
}
