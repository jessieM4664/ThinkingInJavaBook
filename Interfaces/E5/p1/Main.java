package E5.p1;

public class Main implements p2.I {
    public static void main(String args[]) {
        new Main().m1();
        new Main().m2();
        new Main().m3();
    }

    public void m1() {
        System.out.println("Main m1()");
    }
    public void m2() {
        System.out.println("Main m2()");
    }
    public void m3() {
        System.out.println("Main m3()");
    }
}
