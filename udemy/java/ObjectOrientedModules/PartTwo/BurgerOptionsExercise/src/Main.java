public class Main {
    public static void main(String[] args) {
        menuItem();
        Price cheeseburgerPrice = new Price(.07);
        Price deluxeBurgerPrice = new Price(.07);
        Item cheeseburgerItem = new Item(cheeseburgerPrice);
        Item deluxeBurgerItem = new Item(deluxeBurgerPrice);
        Burger cheeseburger = new Burger("white", true, cheeseburgerItem);
        DeluxeBurger deluxeBurger = new DeluxeBurger("Wheat", true, "Jordan", deluxeBurgerItem);


        cheeseburger.addItems().setHasLettuce(true);
        cheeseburger.addItems().setHasCheese(true);
        cheeseburger.addItems().setHasPickle(true);
        System.out.println("Basic burger price " + cheeseburger.basicBurgerPrice());
        System.out.println("Subtotal of purchase " + cheeseburger.subtotal());
        System.out.println("Total of purchase " + cheeseburger.grandtotal());
        cheeseburger.customer();

        deluxeBurger.customer();
    }

    private static void menuItem(){
        Price menuPrice = new Price(0.07);

        System.out.println("Lettuce -> " + menuPrice.getLettucePrice());
        System.out.println("Tomato -> " + menuPrice.getTomatoPrice());
        System.out.println("Pickles -> " + menuPrice.getPicklePrice());
        System.out.println("Cheese -> " + menuPrice.getCheesePrice());
        System.out.println("Current sales tax -> " + menuPrice.getSalesTax());
    }

}
