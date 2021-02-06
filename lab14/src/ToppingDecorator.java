public abstract class ToppingDecorator implements IceCream{
    protected IceCream icecream;
    public ToppingDecorator(IceCream iceCream) {
        this.icecream = iceCream;
    }
    public String getDescription() {
        return icecream.getDescription();
    }
    public double getCost() {
        return icecream.getCost();
    }

}
