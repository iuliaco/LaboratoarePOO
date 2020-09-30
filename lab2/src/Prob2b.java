import java.util.StringTokenizer;

public class Prob2b {

    public static void main(String[] args) {
        String s1 = "sir1";
        String s2 = "sir1 si cu sir2 fac un sir3";
        StringTokenizer st = new StringTokenizer(s2,
                ": ,.-?%n");
        int nr = 0;
        while (st.hasMoreTokens()) {

            if(st.nextToken().equals(s1))
                nr++;
        }
        System.out.println(nr);

    }

}
