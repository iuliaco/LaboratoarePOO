public class Fractie {
    double numitor;
    double numarator;

    public Fractie(double x, double y) {
        numarator = x;
        numitor = y;
    }

    public Fractie() {
        new Fractie(1, 1);
    }

    public double suma(Fractie fr) {
        return numarator / numitor + fr.numarator / fr.numitor;
    }

    public String toString() {
        return "Fractie{" + numarator +
                "/" + numitor +
                ", valoare: " + numarator / numitor + "}";
    }

    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Fractie fractie = (Fractie) o;

        if (Double.compare(fractie.numitor, numitor) != 0) return false;
        return Double.compare(fractie.numarator, numarator) == 0;
    }

    public static void main(String[] args) {
        Fractie unu = new Fractie(6, 4);
        Fractie doi = new Fractie(6,4);
        System.out.println(unu.suma(doi));
        System.out.println(unu.toString());
        System.out.println(unu.equals(doi));

    }

}
