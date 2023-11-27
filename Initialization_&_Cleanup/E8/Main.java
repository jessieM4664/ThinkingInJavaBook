package E8;

public class Main {
    public static void main(String args[]) {
        new Main().method1();
    }

    Main method1() {
        method2();
        method2();
        return this; // returns the current object
    }

    void method2() {
        System.out.println("working");
    }
}
