public class Chocolate extends ToppingDecorator{

    public Chocolate(IceCream iceCream) {
        super(iceCream);
        System.out.println("Adding chocolate");
    }

    @Override
    public String getDescription() {
        return "Chocolate " + icecream.getDescription();
    }

    @Override
    public double getCost() {
        return 1.5 + icecream.getCost();
    }
}
