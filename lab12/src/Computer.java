public class Computer extends Product{

    public Computer(float pret, String nume) {
        super(pret, nume);
    }

    float getPriceReduced() {
        return getPret() - getPret()*10/100;
    }
}
