import java.util.Collections;
import java.util.Scanner;
import java.util.Vector;

class NumarNegativ  extends Exception {
    public NumarNegativ () {
        super("Numarul introdus este negativ");
    }
}



public class Problema3 {
    public Scanner read;
    public Vector numere;
    public Problema3() {
        numere = new Vector();
        read = new Scanner(System.in);
    }
    public void myRead() throws NumarNegativ{
        while (true) {
            int n;
            n = read.nextInt();
            if (n >= 0) {
                numere.add(n);
            }
            if (n < 0) {
                read.close();
                throw new NumarNegativ();
            }
        }
    }

    public static void main(String[] args) {
        Problema3 obj = new Problema3();

        try{
            obj.myRead();
        }catch (NumarNegativ n){
            System.err.println(n);

        }finally {
            System.out.println(Collections.max(obj.numere));
        }

    }

}
