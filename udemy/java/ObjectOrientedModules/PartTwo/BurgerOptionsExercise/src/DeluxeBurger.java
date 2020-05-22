public class DeluxeBurger extends Burger{
    public DeluxeBurger(String breadRoll, boolean hasMeat) {
        super(breadRoll, hasMeat, null);
        this.priceOfAdditions().addDrinkPrice();
        this.priceOfAdditions().addChipsPrice();
    }
}
