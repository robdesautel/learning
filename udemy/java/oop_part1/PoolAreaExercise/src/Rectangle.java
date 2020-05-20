public class Rectangle {
    private double length;
    private double width;

    public Rectangle(double width, double length) {
        if(length < 0 && width < 0){
            this.length = 0;
            this.width = 0;
        }else if(length < 0){
            this.length = 0;
            this.width = width;
        }else if(width < 0 ){
            this.width = 0;
            this.length = length;
        }else{
            this.length = length;
            this.width = width;
        }

    }

    public double getLength() {
        return length;
    }

    public double getWidth() {
        return width;
    }

    public double getArea(){
        return (getLength() * getWidth());
    }

}
