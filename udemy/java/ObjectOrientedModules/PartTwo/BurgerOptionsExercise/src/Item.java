public class Item {
    private boolean hasLettuce;
    private boolean hasTomato;
    private boolean hasPickle;
    private boolean hasCheese;
    private Price price;

    public Item(boolean hasLettuce,
                boolean hasTomato,
                boolean hasPickle,
                boolean hasCheese,
                Price price) {
        this.hasLettuce = hasLettuce;
        this.hasTomato = hasTomato;
        this.hasPickle = hasPickle;
        this.hasCheese = hasCheese;
        this.price = price;
    }

    public boolean isHasLettuce() {
        return hasLettuce;
    }

    public void setHasLettuce(boolean hasLettuce) {
        if(hasLettuce){
            price.addLettucePrice();
        }else if (!hasLettuce && this.hasLettuce){
            price.subtractLettucePrice();
        }
        this.hasLettuce = hasLettuce;
    }

    public boolean isHasTomato() {
        return hasTomato;
    }

    public void setHasTomato(boolean hasTomato) {
        if(hasTomato){
            price.addTomatoPrice();
        }else if (!hasTomato && this.hasTomato){
            price.subtractTomatoPrice();
        }
        this.hasTomato = hasTomato;
    }

    public boolean isHasPickle() {
        return hasPickle;
    }

    public void setHasPickle(boolean hasPickle) {
        if(hasPickle){
            price.addPicklePrice();
        }else if(!hasPickle && this.hasPickle){
            price.subtractPicklePrice();
        }
        this.hasPickle = hasPickle;
    }

    public boolean isHasCheese() {
        return hasCheese;
    }

    public void setHasCheese(boolean hasCheese) {
        if(hasCheese){
            price.addCheesePrice();
        }else if(!hasCheese && this.hasCheese){
            price.subtractCheesePrice();
        }
        this.hasCheese = hasCheese;
    }

    public Price getItemPrices(){
        return price;
    }

    public void server(){
        System.out.println("Service by manager");
    }


}
