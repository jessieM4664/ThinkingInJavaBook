package E1;

public class Main {
    public static void main(String args[]) {
        System.out.println(A.getInstance());
    }
}

class A {  
    static A a;
    private A () { }
    public static A getInstance() {
        a = new A(); // lazy initialization
        return a;
    }
    // SINGLETON rules (one instance):
    // static object a
    // private constructor A
}