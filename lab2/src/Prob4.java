import java.util.Iterator;
import java.util.Vector;

public class Prob4 {

    public static void main(String[] args) {
        Vector v1 = new Vector(10);
        Vector v2 = new Vector(10);
        Vector v3 = new Vector(20);
        v1.add(10);
        v1.add(1);
        v1.add(2);
        v1.add(5);
        v1.add(6);
        v1.add(8);
        v1.add(3);
        v1.add(13);
        v1.add(14);
        v1.add(7);
        v1.add(9);
        v2.add(12);
        v2.add(2);
        v2.add(4);
        v2.add(1);
        v2.add(7);
        v2.add(15);
        v2.add(13);
        v2.add(20);
        v2.add(21);
        v2.add(17);
        Prob4 mult = new Prob4();
        mult.reunite(v1,v2,v3);
        mult.intersection(v1,v2,v3);
        mult.difference(v1,v2,v3);
    }

    public static void reunite(Vector v1, Vector v2, Vector v3) {
        v3 = (Vector) v2.clone();
        for(int i = 0; i < v1.size(); i++) {
            if(!v2.contains(v1.get(i))) {
                v3.add(v1.get(i));
            }
        }
        System.out.println("Dupa reuniune vectorul este: " + v3);
    }

    public static void intersection(Vector v1, Vector v2, Vector v3) {
        Iterator value = v1.iterator();
        for(int i = 0; i < v1.size(); i++) {
            if(v2.contains(v1.get(i))) {
                v3.add(v1.get(i));
            }
        }
        System.out.println("Dupa intersectie vectorul este: " + v3);
    }
    public static void difference(Vector v1, Vector v2, Vector v3) {
        v3 = (Vector) v1.clone();
        Iterator value = v2.iterator();
        for(int i = 0; i < v2.size(); i++) {
            if(v3.contains(v2.get(i))) {
                v3.remove(v2.get(i));
            }
        }
        System.out.println("Dupa diferenta vectorul este: " + v3);
    }

}
