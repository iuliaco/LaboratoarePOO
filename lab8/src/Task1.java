//package lab08;
//
//import java.util.*;
//
//class ArrayMapEntry<K,V> implements Map.Entry<K, V>{
//    private K key;
//    private V value;
//
//    public ArrayMapEntry(K key, V value) {
//        this.key = key;
//        this.value = value;
//    }
//
//    @Override
//    public K getKey() {
//        return key;
//    }
//
//    @Override
//    public V getValue() {
//        return value;
//    }
//
//    @Override
//    public V setValue(V value) {
//        this.value = value;
//        return value;
//    }
//
//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (!(o instanceof ArrayMapEntry)) return false;
//        ArrayMapEntry<?, ?> that = (ArrayMapEntry<?, ?>) o;
//        return key.equals(that.getKey()) &&
//                value.equals(that.getValue());
//    }
//
//    @Override
//    public int hashCode() {
//        return key.hashCode() ^ value.hashCode();
//    }
//
//    @Override
//    public String toString() {
//        return "ArrayMapEntry{" +
//                "key=" + key +
//                ", value=" + value +
//                '}';
//    }
//}
//
//class ArrayMap<K, V> extends AbstractMap<K, V> {
//    public ArrayList<Entry<K, V>> list;
//
//    public ArrayMap() {
//        list = new ArrayList<Entry<K, V>>();
//    }
//    public int size() {
//        return list.size();
//    }
//    public V put(Object key, Object value) {
//        ArrayMapEntry elem = new ArrayMapEntry(key,value);
//        list.add(elem);
//        return (V) elem.getValue();
//    }
//    @Override
//    public Set entrySet() {
//
//        HashSet<Map.Entry<K, V>> t = new HashSet<>();
//
//        for (int i = 0; i < this.list.size(); i++){
//            ArrayMapEntry elem = list.get(i);
//            t.add(elem);
//        }
//
//        return t;
//    }
//
//
//}
//
//public class Task1 {
//
//    public static void main(String args[]) {
//        ArrayMap<Integer, String> map = new ArrayMap<>();
//
//        System.out.println("Populam colectia...");
//        map.put(7, "Colectii si genericitate");
//        map.put(8, "Clase interne");
//        map.put(5, "Fluxuri");
//
//        System.out.println("Verificam...");
//        System.out.println("Continutul colectiei: " + map);
//
//        if (map.size() != 3) {
//            System.err.println("ArrayMap.size() (" + map.size() + ") a fost implementata gresit.");
//        }
//
//        Set<Map.Entry<Integer, String>> entries = map.entrySet();
//        if (entries.size() != 3) {
//            System.err.println("ArrayMap.entrySet() a fost implementata gresit.");
//        }
//
//        for (Map.Entry<Integer, String> e : entries) {
//            map.put(e.getKey(), new StringBuffer(e.getValue()).reverse().toString());
//            if (!map.entrySet().contains(e)) {
//                System.err.println("ArrayMap.put() nu inlocuieste vechea valoare.");
//            }
//            if ((!e.toString().contains(e.getKey().toString()) || (!e.toString().contains(e.getValue())))) {
//                System.err.println("ArrayMap.ArrayMapEntry.toString() a fost implementata gresit.");
//            }
//        }
//
//        for (Map.Entry<Integer, String> e1 : entries) {
//            for (Map.Entry<Integer, String> e2 : entries) {
//                if ((e1 == e2) != (e1.equals(e2))) {
//                    System.err.println("ArrayMap.ArrayMapEntry.equals() a fost implementata gresit.");
//                }
//                if ((e1 == e2) != (e1.hashCode() == e2.hashCode())) {
//                    System.err.println("ArrayMap.ArrayMapEntry.hashCode() a fost implementata gresit.");
//                }
//            }
//        }
//    }
//}
