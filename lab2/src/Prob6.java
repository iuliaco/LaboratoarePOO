import java.util.Vector;

public class Prob6 {
    public static void main(String[] args) {
        Vector v = new Vector();
        Vector contor = new Vector();
        v.add(7.5);
        v.add("String");
        v.add(7);
        v.add('a');
//        for (int i = 0; i < v.size(); i++) {
//
//        }
        System.out.println(v.get(0).getClass());
        System.out.println(v.get(1).getClass());
    }

}
