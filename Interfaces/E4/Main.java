package E4;

public class Main {
    public static void main(String args[]) {
        m2();
    }
    public static void m2() {
        A a = new B();
        a.m1();
    }
}

abstract class A {
    abstract public void m1();
}

class B extends A {
    public void m1() {
        System.out.println("B m1()");
    }
}
