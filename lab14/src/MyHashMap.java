import java.util.ArrayList;
import java.util.HashMap;

public class MyHashMap<K, V> extends HashMap<K, ArrayList<V>> {
    private K key;
    private V value;

    public MyHashMap() {
        super();
    }
    boolean containsKey() {
        return super.containsKey(key);
    }

    @Override
    public void put(K key, V value) {

    }

}
