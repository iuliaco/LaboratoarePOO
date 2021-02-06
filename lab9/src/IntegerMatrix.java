import java.util.ArrayList;

public class IntegerMatrix extends AMatrix<Integer> {

    @Override
    public String toString() {
        String s= "{";
        for(ArrayList lst : this) {
            for(Object a : lst) {
                s += " " + (Integer)a;
            }
            s += '\n';
        };
        s += "}";
        return s;
    }

    @Override
    public AMatrix addition(AMatrix m1) {
        int size = this.size();
        int i, j;
        for (i = 0 ; i < size; i++) {
            ArrayList h = (ArrayList)m1.get(i);
            System.out.println(this.get(i).size());
            for (j = 0; j < this.get(i).size(); j++) {
                System.out.println(this.get(i).size());
                this.get(i).set(j, this.get(i).get(j) + (Integer) h.get(j));
            }
        }

        return m1;
    }

    @Override
    public Integer sum(Integer obj1, Integer obj2) {
        return obj1 + obj2;
    }

    public static void main(String[] args) {
        IntegerMatrix aaa = new IntegerMatrix();
        ArrayList l1 = new ArrayList();
        l1.add(1);
        l1.add(2);
        l1.add(3);
        l1.add(4);
        l1.add(5);
        ArrayList l2 = new ArrayList();
        l2.add(1);
        l2.add(2);
        l2.add(3);
        l2.add(4);
        l2.add(5);
        ArrayList l3 = new ArrayList();
        l3.add(1);
        l3.add(2);
        l3.add(3);
        l3.add(4);
        l3.add(5);

        aaa.add(l1);
        aaa.add(l2);
        aaa.add(l3);
        System.out.println(aaa);

        aaa.addition(aaa);
        System.out.println(aaa);
    }
}
