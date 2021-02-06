public class TestIce {
    public static void main(String[] args) {
        BasicIceCream basic = new BasicIceCream();
        Chocolate chocobasic = new Chocolate(basic);
        Vanilla vanchocobasic = new Vanilla(chocobasic);
        System.out.println(chocobasic.getDescription());
        System.out.println(vanchocobasic.getDescription());
        System.out.println(chocobasic.getCost());

    }
}
