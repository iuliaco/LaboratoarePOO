public abstract class Product {
    private float pret;
    private String nume;

    public Product(float pret, String nume) {
        this.pret = pret;
        this.nume = nume;
    }

    public float getPret() {
        return pret;
    }

    public void setPret(float pret) {
        this.pret = pret;
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }
    abstract float getPriceReduced();

    @Override
    public String toString() {
        return "Product{" +
                "pret=" + pret +
                ", nume='" + nume + '\'' +
                '}';
    }
}
