import java.util.Arrays;

public class Problema8 {
    public static void main(String[] args) {
        double nr[] = new double[30];
        for (int i = 0; i < 30; i++) {
            nr[i] = Math.random() * 50 + 1;
        }
        Arrays.sort(nr);
        for(int i = 0; i < 20; i++) {
            double random = Math.random() * 50 + 1;
            System.out.println(Arrays.binarySearch(nr, random));
        }
        System.out.println(nr);
    }
}
