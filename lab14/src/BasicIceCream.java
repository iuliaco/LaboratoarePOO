import java.util.ArrayList;

public class BasicIceCream implements IceCream{
    public String toppings;
    double cost;
    public BasicIceCream() {
        toppings = "cone";
        cost = 0.5;
        System.out.println("Adding cone");
    }
    @Override
    public String getDescription() {
        return toppings.toString();
    }

    @Override
    public double getCost() {
        return cost;
    }

    public String getToppings() {
        return toppings;
    }

    public void setToppings(String toppings) {
        this.toppings = toppings;
    }
}
