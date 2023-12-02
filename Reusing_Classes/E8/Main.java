package E8;

public class Main {
    public static void main(String args[]) {
        System.out.println("1st instance of Derived (no argument)");
        new Derived();

        System.out.println("\n2nd instance of Derived (passed argument 5)");
        new Derived(5);
    }
}

class Base {
    Base(int... y) {
        System.out.println("Base default/argument constructor: " + y);
    }
}

class Derived extends Base {
    Derived() {
        super();
    }

    Derived(int x) {
        super(10);
        System.out.println("Derived argument constructor: " +  x);
    }
}
