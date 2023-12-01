package E3;

public class Main extends A {
    public static void main(String args[]) {
        Main m = new Main();
        // it will automatically call the outer class constructor
    }
}

class A {
    A() {
        System.out.println("class A constructor");
    }
}
