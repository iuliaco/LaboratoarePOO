public class Prob2 {
    public static void main(String[] args) {
        String s1 = "sir";
        String s2 = "sir1 si cu sir2 fac un sir3";
        String[] arr = s2.split(" ");
        int nr = 0;
        for(String i: arr) {
            if(i.equals(s1))
                nr++;
        }
        System.out.println(nr);
    }

}
