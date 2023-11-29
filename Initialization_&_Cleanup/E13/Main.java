package E13;

public class Main { // explicit static
    public static void main(String args[]) {
        System.out.println("Inside main()");
        Cups.cup1.f(99); // 1
    }
}

class Cup {
    Cup(int marker) {
        System.out.println("Cup(" + marker + ")");
    }
    void f(int marker) {
        System.out.println("f(" +  marker + ")");
    }
}

class Cups {
    static Cup cup1;
    static Cup cup2;
    static {
        cup1 = new Cup(1); // called before Cups constructor
        cup2 = new Cup(2); // ALSO called at the same time ^
    }
    Cups() {
        System.out.println("Cups()");
    }
}