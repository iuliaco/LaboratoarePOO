import java.util.Arrays;



public class Prob5 {
    public static void main(String[] args) {
        String text = "Un terorist avea o bomba";
        String cuvinte[] = new String[2];
        cuvinte[0] = "terorist";
        cuvinte[1] = "bomba";
        Prob5 prb5 = new Prob5();
        String rezultat;
        rezultat = prb5.cenzurare(text, cuvinte);
        System.out.println(rezultat);
    }
    public static String cenzurare(String text, String[] cuvinte) {
        StringBuffer sbf = new StringBuffer("");
        String[] parts = text.split(" ");
        for (String i: parts) {
            if(Arrays.asList(cuvinte).contains(i)){
                sbf.append(i.charAt(0));
                for (int j = 1; j < i.length()-1; j++ ) {
                    sbf.append("*");
                }
                sbf.append(i.charAt(i.length()-1));

            } else {
                sbf.append(i);
            }
            sbf.append(" ");
        }
        String fin = sbf.toString();
        return fin;
    }
}
