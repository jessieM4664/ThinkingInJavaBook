package E4;

public class Main {
    public static void main(String args[]) {
        Leaf leaf = new Leaf();
        leaf.m1();
        leaf.m2();

        Tree tree = new Tree();
        tree.m1();
//!     tree.m2(); Error: "The method m2 is undefined for type Tree"
        
        // OUTPUT (both constructors are called 
        // because leaf inherits Tree)::
        
        // Tree class constructor
        // Leaf class constructor
        // Tree m1 (public)
        // Leaf m2 (protected)
        // Tree class constructor
        // Tree m1 (public)
    }
}
