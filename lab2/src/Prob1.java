public class Prob1 {
    public static void main(String[] args) {
        String s1 = "si";
        String s2 = "sir1 si cu sir2 fac un sir3";
        int pos = s2.indexOf(s1, 0);
        int nr = 0;
        while (pos != -1 && nr < 10) {
            nr++;
            s2 = s2.substring(pos + s1.length(), s2.length());
            pos = s2.indexOf(s1, 0);
        }
        System.out.println(nr);
    }
}
