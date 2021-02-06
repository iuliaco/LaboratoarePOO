import java.util.LinkedList;
import java.util.Set;

public class LinkedSet extends LinkedList implements Set {
    public boolean add(Object obj) {
        if (this.contains(obj))
            return false;
        else
            return super.add(obj);
    }
    public void add(int i, Object obj) {
        if (this.contains(obj))
            return;
        else
            super.add(i, obj);
    }
    public Object set(int i, Object obj) {
        if (this.contains(obj))
            return false;
        else
            return super.set(i, obj);
    }
}
