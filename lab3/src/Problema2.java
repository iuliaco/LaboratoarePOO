import java.util.Arrays;

public class Problema2 {
    public static void main(String[] args) {
        Produse a, b, c;
        Magazin m1;
        a = new Produse("ananas", 5.8, 7);
        b = new Produse("mere", 3.5, 15);
        c = new Produse("zmeura", 15, 10);
        m1 = new Magazin("bio", a, b, c);
        System.out.println(m1.toString());
        System.out.println(m1.getTotalMagazin());
    }
}

class Magazin {
    Produse[] produse;
    String nume;
    public Magazin(String name, Produse a, Produse b, Produse c) {
        this.nume = name;
        produse = new Produse[3];
        this.produse[0] = a;
        this.produse[1] = b;
        this.produse[2] = c;
    }

    public String toString() {
        String aux = "Nume magazin: " + this.nume+ ". \n";
        for (int i = 0; i < produse.length; i++) {
            aux = aux +"Produsul " + i + ": " + produse[i].toString() + " . \n";
        }
        return aux;
    }
    public double getTotalMagazin() {
        return produse[0].getTotalProdus() + produse[1].getTotalProdus() + produse[2].getTotalProdus();
    }
}
class Produse {
    String nume;
    double pret;
    int cantitate;
    public Produse(String name, double price, int quantity) {
        this.nume = name;
        this.pret = price;
        this.cantitate = quantity;
    }

    public String toString() {
        return "Produs " + nume +", pret: " + pret + ", cantitate: " + cantitate;
    }
    public double getTotalProdus() {
        return  this.pret * this.cantitate;
    }
}