import java.util.ArrayList;
import java.util.Collections;

public class GenericListMethods implements  GenericInterface{

    @Override
    public <E extends Comparable<E>> ArrayList<E> removeDuplicates(ArrayList<E> list) {
        return null;
    }

    @Override
    public <E extends Comparable<E>> E max(ArrayList<E> list) {
        return Collections.max(list);
    }

    @Override
    public <E extends Comparable<E>> int binarySearch(ArrayList<E> list, E key, int start, int end) {
        return 0;
    }
}
