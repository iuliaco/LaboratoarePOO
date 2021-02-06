public class Book extends Product{

    public Book(float pret, String nume) {
        super(pret, nume);
    }

    float getPriceReduced() {
        return getPret() - getPret()*15/100;
    }
}
