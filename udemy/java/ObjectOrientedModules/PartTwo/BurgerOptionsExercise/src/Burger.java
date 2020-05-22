public class Burger {
    private String breadRoll;
    private boolean hasMeat;
    private boolean hasLettuce;
    private boolean hasTomato;
    private boolean hasPickle;
    private boolean hasCheese;
    private double price;

    public Burger(String breadRoll,
                  boolean hasMeat,
                  double price) {

        this.breadRoll = breadRoll;
        this.hasMeat = hasMeat;
        if(price < 0.0){
            this.price = -1;
        }else {
            this.price = price;
        }
    }

    public double getPrice(){
        return price;
    }
    private void addPrice(double price){
        this.price += price;
    }

    private void subtractPrice(double price) {
        this.price -= price;
    }

    public boolean isHasLettuce() {
        return hasLettuce;
    }

    public void setHasLettuce(boolean hasLettuce) {
        if(hasLettuce){
            addPrice(0.5);
        }else if (!hasLettuce && this.hasLettuce){
            subtractPrice(0.5);
        }

        this.hasLettuce = hasLettuce;
    }

    public boolean isHasTomato() {
        return hasTomato;
    }

    public void setHasTomato(boolean hasTomato) {
        if(hasTomato){
            addPrice(0.25);
        }else if (!hasTomato && this.hasTomato){
            subtractPrice(0.25);
        }
        this.hasTomato = hasTomato;
    }

    public boolean isHasPickle() {
        return hasPickle;
    }

    public void setHasPickle(boolean hasPickle) {
        if(hasPickle){
            addPrice(0.15);
        }else if(!hasPickle && this.hasPickle){
            subtractPrice(0.15);
        }

        this.hasPickle = hasPickle;
    }

    public boolean isHasCheese() {
        return hasCheese;
    }

    public void setHasCheese(boolean hasCheese) {
        if(hasCheese){
            addPrice(1.00);
        }else if(!hasCheese && this.hasCheese){
            subtractPrice(1.00);
        }

        this.hasCheese = hasCheese;
    }

    public void server(){
        System.out.println("Service by manager");
    }

    public String getBreadRoll() {
        return breadRoll;
    }

    public boolean isHasMeat() {
        return hasMeat;
    }
}
