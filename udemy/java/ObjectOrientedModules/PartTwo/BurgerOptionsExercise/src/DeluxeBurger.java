public class DeluxeBurger extends Burger{
    private String customerName;
    public DeluxeBurger(String breadRoll, boolean hasMeat, String customerName) {
        super(breadRoll, hasMeat, null);
        this.customerName = customerName;
        this.priceOfAdditions().addDrinkPrice();
        this.priceOfAdditions().addChipsPrice();
    }

    @Override
    public void customer() {
        System.out.println("For customer " + customerName);
    }
}
