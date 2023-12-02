package E7;

public class Main {
    public static void main(String args[]) {
        new C();
    }
}

class A {
    A(int x) { // argument constructors
        System.out.println("class A constructor");
        System.out.println("constructor A argument from B: " + x);
    }
}

class B {
    B(int y) { //argument constructors
        System.out.println("class B constructor");
        System.out.println("constructor B argument from C: " + y);
    }
}

class C extends A {
    C() {
        super(5);
    }
}

// Class hierarchy::
// (Object)
// A
// C

// (Object)
// Main

// (Object)
// B