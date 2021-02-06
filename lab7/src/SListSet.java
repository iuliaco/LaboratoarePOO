import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;



public class SListSet extends LinkedList implements SortedSet {
    public Comparator compar;
    public Comparator comparator () {
        return compar;
    }
    public SListSet() {
        this(null);
    }
    public SListSet(Comparator compar) {
        this.compar = compar;
    }
    public boolean add(Object o) {
        if (this.contains(o))
            return false;
        else {
            super.add(o);
            Collections.sort(this, compar);
            return true;
        }
    }
    public Object first() {
        return super.getFirst();
    }
    public Object last() {
        return super.getLast();
    }
    public SortedSet subSet(Object from, Object to) {
        SortedSet s = new SListSet();
        s.addAll(subList(this.indexOf(from), this.indexOf(to)));
        return s;
    }
    public SortedSet headSet(Object to) {

        SortedSet s = new SListSet();
        s.addAll(this.subList(0, this.indexOf(to)));
        return s;
    }
    public SortedSet tailSet(Object from) {

        SortedSet s = new SListSet();
        s.addAll(subList(this.indexOf(from), this.size() - 1));
        return s;
    }

    public static void main(String[] args) {
        String path = "D:\\laboratoarePOO\\lab7\\src\\Arhiva\\test01.txt";
        SListSet tree = new SListSet();
        SListSet tree2 = new SListSet(new The_Comparator());
        try {
            File myObj = new File(path);
            Scanner myReader = new Scanner(myObj);
            while(myReader.hasNextLine()) {
                String data = myReader.nextLine();
                String[] arr = data.split("[\t ,.{} \\\" ; () : ]");
                for( String ss: arr ) {
                    tree.add(ss);
                    tree2.add(ss);
                }
            }
            myReader.close();

        } catch (FileNotFoundException e) {
            System.err.println(e);
        }
        System.out.println(tree);
        System.out.println(tree2);
        System.out.println(tree.subSet(tree.get(2), tree.get(5)));
    }
}
