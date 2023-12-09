package The_Pattern_Concept.E1;

final public class A { // final to undermine the clone() in Object class
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