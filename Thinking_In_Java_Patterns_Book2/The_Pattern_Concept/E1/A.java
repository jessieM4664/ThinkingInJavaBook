package The_Pattern_Concept.E1;

public class A {
    private static A instance = null;
    private A () { }
    public static A getInstance() {
        if (instance == null) {
            return instance = new A();
        } else {
            return instance;
        }
    }
}