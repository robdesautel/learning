public class HealthyBurger extends Burger {
    private String customerName;
    private boolean chips;
    private boolean drink;

    public HealthyBurger(boolean hasMeat,
                         Item item,
                         String customerName) {
        super("brown rye bread", hasMeat, item);
        this.customerName = customerName;

    }
    public void setChips(boolean chips){
        if(chips){
            this.priceOfAdditions().addCheesePrice();
        }else if (!chips && this.chips) {
            this.priceOfAdditions().subtractCheesePrice();
        }
        this.chips = chips;
    }

    public void setDrink(boolean drink){
        if(drink){
            this.priceOfAdditions().addDrinkPrice();
        } else if(!drink && this.drink){
            this.priceOfAdditions().subtractDrinkPrice();
        }
        this.drink = drink;
    }

    @Override
    public void customer(){
        System.out.println("For customer " + customerName);
    }

}
