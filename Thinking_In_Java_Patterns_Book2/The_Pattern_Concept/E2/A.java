package The_Pattern_Concept.E2;

public class A {
    private static A instance1 = new A();
    private static A instance2 = new A();
    private static A instance3 = new A();
    private A() { }

    public static A getInstance1() {
        return instance1;
    }
    public static A getInstance2() {
        return instance2;
    }
    public static A getInstance3() {
        return instance3;
    }
}
