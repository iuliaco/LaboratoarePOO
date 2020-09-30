public class Problema5 {
    public double putere(double nr, double pow) {
        if (pow == 0)
            return 1;
        return nr*putere(nr, pow-1);
    }
    public static void print(double nr){
        System.out.println(nr);
    }
    public static void printstr(String str){
        System.out.println(str);
    }
    public static void main(String[] args) {
        Problema5 obiect = new Problema5();
        obiect.printstr("Rezultatul pentru functia mea este:");
        obiect.print(obiect.putere(2,3));
        obiect.printstr("Rezultatul pentru functia math este:");
        obiect.print(Math.pow(2,3));

    }
}
