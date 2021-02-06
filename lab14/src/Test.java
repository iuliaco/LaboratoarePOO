
import java.util.ArrayList;


//class A {
//    int x;
//
//    public A() {
//        init(0);
//    }
//
//    protected void init(int x) {
//        System.out.println("LOl");
//        this.x = x;
//    }
//}
//
//class B extends A {
//    public B() {
//        init(super.x + 1);
//    }
//
//    public void init(int x) {
//        this.x = x + 1;
//    }
//}

//public class Test {
//    public static void main(String[] args) {
//        A a = new B();
//        System.out.println(a.x);
//    }
//
//
//}

//class Announce {
//    public static void main(String[] args) {
//        for (int __x = 0; __x < 3; __x++) ;
////        int #lb = 7;
//        long[] x[5];
//        Boolean[] ba[];
//        enum Traffic {RED, YELLOW, GREEN}
//        ;
//    }
//}

class MyException extends RuntimeException {
}
class MyClass{
    boolean member = true;

}
class Test1{
    void f(int x, MyClass c) {
        x = 5;

        c = new MyClass();
        c.member = false;
    }

    public static void main(String[] args) {
       MyClass c = new MyClass();
       Test1 test = new Test1();
       test.f(5, c);
       System.out.println(c.member);
       System.out.println(((Double)(Object)(3.2)).equals(3.2));
    }
}

//class A{
//    private int counter = 0;
//    public static int getInstCount() {
//        return counter;
//    }
//}

//class T{

//}
//public final class Min{
//    public static <T extends Comparable<T>> detmin(T x, T y) {
//        if(x.compareTo(y) < 0) {
//
//        }
//    }
//}

class Test3{
    public static Object max(Object o1, Object o2) {
        if(((Comparable)o1).compareTo(o2) >= 0) {
            return o1;
        }
        return o2;
    }
}

class POO {
    public static void main(String[] args) {
        int[][] a = {{1,2}, {3, 4}};
        int[] b = (int[]) a[1];
        Object o1 = a;
        int[][] a2 = (int[][]) o1;
        int[] b2 = (int[]) o1;
        System.out.println(b[1]);
    }
}

class X{void do1(){ }}
class Y extends X{void do2(){System.out.println("Merg");}}
class Chrome{
    public static void main(String[] args) {
        X x1 = new X();
        X x2 = new Y();
        Y y1 = new Y();
        ((Y)x2).do2();
    }
}

class Foo{
    static int x;
    Foo() {
        doSth(); x++;
    }
    void doSth() {
        x++;
    }
}
class Bar extends Foo{
    Bar() {
        System.out.println(x);
    }
    void doSth() {
        x += 2;
    }

    public static void main(String[] args) {
        Bar b = new Bar();
        System.out.println((Bar)(Foo)b == b);
    }
}