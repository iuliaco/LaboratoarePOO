//package lab08;
//
//import java.util.Iterator;
//class LinkedList<T> extends Iterable<LinkedList.Node>{
//    private T node;
//    //Insereaza un nod la inceputul listei
//    public void addFirst(T data);
//    //Insereaza un nod la sfarsitul listei
//    public void add(T data);
//    //Returneaza primul nod din lista
//    public T getNode();
//    //Returneaza un obiect de tip ListIterator
//    public Iterator<T> iterator();
//    static class Node{
//
//    }
//}
//public class Task3 {
//
//    public static void main(String[] args) {
//        LinkedList<Integer> list = new LinkedList<>();
//        list.add(10);
//        list.add(20);
//        list.addFirst(5);
//        list.add(22);
//        list.add(25);
//        list.add(30);
//
//        int last = 0;
//        System.out.println("Afisare 1");
//        for (Integer i : list) {
//            System.out.print(i + ", ");
//            if (i < last) {
//                System.err.println("LinkedList a fost implementata gresit.");
//            }
//            last = i;
//        }
//        System.out.println();
//
//        System.out.println("Afisare 2");
//        Iterator<Integer> itr = list.iterator();
//        while (itr.hasNext()) {
//            System.out.print(itr.next() + ", ");
//        }
//        System.out.println();
//    }
//}