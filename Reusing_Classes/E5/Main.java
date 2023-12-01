package E5;

public class Main {
    public static void main(String args[]) {
        new C();
    }
}

class A {
    A() {
        System.out.println("class A constructor");
    }
}

class B {
    B() {
        System.out.println("class B constructor");
    }
}

class C extends A {

}