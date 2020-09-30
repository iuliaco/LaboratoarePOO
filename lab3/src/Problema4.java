public class Problema4 {
    public static void main(String[] args) {
        Numar numar;
        numar = new Numar(3);
        System.out.println(numar.suma(1, 2, 4, 5));
    }
}
class Numar{
    int nr;
    public Numar(int numar) {
        this.nr = numar;
    }

    //returneaza suma dintre nr (membrul clasei) si a
    public int suma(int a) {
        return this.nr + a;
    }
    //returneaza suma dintre nr, a si b
    public int suma(int a, int b) {
        return this.suma(a) + b;
    }
    //returneaza suma dintre nr, a, b si c
    public int suma(int a, int b, int c) {
        return this.suma(a,b) + c;
    }
    //returneaza suma dintre nr, a, b, c si d
    public int suma(int a, int b, int c, int d) {
        return suma(a, b, c) + d;
    }

}