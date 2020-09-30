class D {
    public D() {
        System.out.println("Constructor D");
    }
}
class A extends D{
    public A() {
        this(10);
        System.out.println("Constructor 1 - A");
    }
    public A(int nr) {
        System.out.println("Constructor 2 - A " + nr);
    }
}
class B extends A {
    public B(int nr) {
        System.out.println("Constructor 1 - B " + nr);
    }
}
class C extends B {
    public C() {
        super(7);
        System.out.println("Constructor - C");
    }
}
class Test {
    public static void main(String args[]) {
        C obj = new C();
    }
}