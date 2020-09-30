import java.lang.reflect.Array;
import java.util.Arrays;

public class Problema7 {


    public static void main(String[] args) {
        int[] prime = new int[]{1, 2, 3, 5, 7, 11, 13, 17, 19, 23};
        for (int numere = 1; numere < 5; numere++) {
            int n = numere*2;
            for (int i = 0; prime[i] <= n / 2; i++) {
                int diff = n - prime[i];

                if (Arrays.binarySearch(prime, diff) >= 0) {
                    System.out.println(n + " = " + prime[i] + " + " + diff);
                }
            }
        }
    }
}
