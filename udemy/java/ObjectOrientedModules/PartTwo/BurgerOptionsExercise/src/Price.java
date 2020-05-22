public class Price {
    private double subTotal;
    private double salesTax;
    private double grandTotal;
    private double lettucePrice;
    private double picklePrice;
    private double cheesePrice;
    private double tomatoPrice;
    private double chipsPrice;
    private double drinkPrice;

    public Price(double salesTax) {
        if(salesTax <= 0.00){
            this.salesTax = -1d;
        }else {
            this.salesTax = salesTax;
        }
        this.lettucePrice = 0.5d;
        this.picklePrice = 0.15d;
        this.cheesePrice = 1.00d;
        this.tomatoPrice = 0.25d;
        this.chipsPrice = 0.75d;
        this.drinkPrice = 1.5;
    }
    public void calculateGrandTotal(){
        grandTotal = subTotal + (subTotal * salesTax);
    }
    public void subtractLettucePrice() {
        subTotal -= lettucePrice;
    }

    public void subtractPicklePrice() {
        subTotal -= picklePrice;
    }

    public void subtractCheesePrice() {
        subTotal -= cheesePrice;
    }
    public void subtractTomatoPrice(){
        subTotal -= tomatoPrice;
    }

    public void subtractChipPrice(){
        subTotal -=  chipsPrice;
    }

    public void subtractDrinkPrice(){
        subTotal -= drinkPrice;
    }

    public void addLettucePrice() {
        this.subTotal += lettucePrice;
    }

    public void addPicklePrice() {
        subTotal += picklePrice;
    }

    public void addCheesePrice() {
        subTotal += cheesePrice;
    }
    public void addTomatoPrice(){
        subTotal += cheesePrice;
    }

    public void addChipsPrice(){
        subTotal += chipsPrice;
    }

    public void addDrinkPrice(){
        subTotal += drinkPrice;
    }


    public double getSubTotal() {
        return subTotal;
    }

    public double getSalesTax() {
        return salesTax;
    }

    public double getGrandTotal() {
        return grandTotal;
    }

    public double getLettucePrice() {
        return lettucePrice;
    }

    public double getPicklePrice() {
        return picklePrice;
    }

    public double getCheesePrice() {
        return cheesePrice;
    }

    public double getTomatoPrice() {
        return tomatoPrice;
    }
}
