public class DeluxeBurger extends Burger{
    private String customerName;
    public DeluxeBurger(String breadRoll, boolean hasMeat, String customerName, Item item) {
        super(breadRoll, hasMeat, item);
        this.customerName = customerName;
        this.priceOfAdditions().addDrinkPrice();
        this.priceOfAdditions().addChipsPrice();
    }

    @Override
    public void customer() {
        System.out.println("For customer " + customerName);
    }
}
