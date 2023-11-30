package E4;

public class Leaf extends Tree {
    Leaf() {
        System.out.println("Leaf class constructor");
    }

    protected void m2() {
        System.out.println("Leaf m2 (protected)");
    }
}
