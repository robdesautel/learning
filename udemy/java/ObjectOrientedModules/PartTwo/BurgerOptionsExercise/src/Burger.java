public class Burger {
    private String breadRoll;
    private boolean hasMeat;
    private Item item;

    public Burger(String breadRoll,
                  boolean hasMeat,
                  Item item) {

        this.breadRoll = breadRoll;
        this.hasMeat = hasMeat;
        this.item = item;
    }

    public String getBreadRoll() {
        return breadRoll;
    }

    public boolean isHasMeat() {
        return hasMeat;
    }

    public double subtotal(){
        return item.getItemPrices().getSubTotal();
    }

    public double grandtotal(){
        return item.getItemPrices().getGrandTotal();
    }

    public Price priceOfAdditions(){
        return item.getItemPrices();
    }

}
