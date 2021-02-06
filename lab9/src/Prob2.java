import java.util.*;

class ArrayMap<K, V> extends AbstractMap<K, V> {
    public final Vector<K> key;
    public final Vector<V> value;


    public ArrayMap() {
        key = new Vector<K>();
        value = new Vector<V>();
    }


    public String toString() {
        return super.toString();
    }
    public V put(K cheie, V valoare) {
        if(key.contains(cheie)) {
            value.add(key.indexOf(cheie), valoare);
            return valoare;
        }
        key.add(cheie);
        value.add(valoare);
        return valoare;
    }
    public V get(Object obj) {
        return this.value.get(this.key.indexOf(obj));
    }
    public Set<K> keySet() {
        TreeSet<K> t = new TreeSet<>();
        t.addAll(this.key);
        return t;
    }
    public Collection<V> values() {
        List c = Collections.list(this.value.elements());
        return this.value;
    }
    class ArrayMapEntry<K, V> implements Map.Entry<K, V>{
        K key;
        V value;
        public K getKey() {
            return this.key;
        }
        public V getValue() {
            return value;
        }

        public V setValue(V value) {
            this.value = value;
            return value;
        }
        public void setKey(K key){
            this.key = key;
        }

    }
    public Set<Map.Entry<K, V>> entrySet() { // atentie! Se va defini o clasa interna pentru o intrare in dictionar - **//Map.Entry//**
        ArrayMapEntry a = new ArrayMapEntry();
        TreeSet<Map.Entry<K, V>> t = new TreeSet<>();

        for (int i = 0; i < this.key.size(); i++){
            a.setValue(this.value.get(i));
            a.setKey(this.key.get(i));
            t.add(a);
        }

        return t;
    }

}

public class Prob2 {


}
