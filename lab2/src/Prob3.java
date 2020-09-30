import java.util.Collection;
import java.util.Collections;
import java.util.Random;
import java.util.Vector;

public class Prob3 {
    public static void main(String[] args) {
        int valMax = 10;
        Random generator = new Random();
        Vector nr = new Vector(20);
        for (int i = 0; i < 20; i++) {
            int n = generator.nextInt(valMax);
            nr.add(n);
        }
        Prob3 gen = new Prob3();
        int times = gen.eliminate(nr, 3);
        System.out.println(times + " si vectorul "+ nr);
        System.out.println("Cel mai mare nr e " + Collections.max(nr));
        int min = (int) Collections.min(nr);
        System.out.println("Cel mai mic numar se afla pe locul:" + nr.indexOf(min));
        int sum = 0;
        for (int i = 0; i < nr.size(); i++) {
            sum += (Integer)nr.get(i);
        }
        double average = sum / nr.size();
        System.out.println("Media aritmetica este:" + average);
    }

    public static int eliminate(Vector vect, int n) {
        int nr = 0;
        while (vect.contains(n)) {
            nr++;
            vect.remove(Integer.valueOf(n));
        }
        return nr;
    }


}
