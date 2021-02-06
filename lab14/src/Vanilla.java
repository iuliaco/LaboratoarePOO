public class Vanilla extends ToppingDecorator{

    public Vanilla(IceCream iceCream) {
        super(iceCream);
        System.out.println("Adding chocolate");
    }



    @Override
    public String getDescription() {
        return "Vanilla " + icecream.getDescription();
    }

    @Override
    public double getCost() {
        return 2.0 + icecream.getCost();
    }
}
