public class Price {
    private double subTotal;
    private double salesTax;
    private double grandTotal;
    private double lettucePrice = 0.5d;
    private double picklePrice = 0.15d;
    private double cheesePrice = 1.00d;
    private double tomatoPrice = 0.25d;

    public Price(double salesTax) {
        if(salesTax <= 0.00){
            this.salesTax = -1d;
        }else {
            this.salesTax = salesTax;
        }
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
        subTotal -= this.cheesePrice;
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
