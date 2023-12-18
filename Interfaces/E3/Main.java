package E3;

public class Main {
    public static void main(String args[]) {
        B b = new B();
        b.print();

        // output:
        // 5
        // 5
        
        // Reasoning: the constructor is called first, then the print method.
    }
}

abstract class A {
    A () {
        print();
    }
    abstract public void print();
}

class B extends A {
    static int x = 5;
    public void print() {
        System.out.println(x);
    }    
}
