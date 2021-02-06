public class Food extends Product{

    public Food(float pret, String nume) {
        super(pret, nume);
    }

    float getPriceReduced() {
        return getPret() - getPret()*20/100;
    }
}
