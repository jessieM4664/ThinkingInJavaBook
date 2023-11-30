package E6;

public class Main {
    public static void main(String args[]) {
        new B();
    }
}

class A {
    protected int x = 0; // protected data
}

class B extends A {
    B() {
        m1();
    }

    public void m1() {
        x++; // without inheritance, Error occurs: 
             // "x cannot be resolved to a variable"
        System.out.println(x);
    }
}
