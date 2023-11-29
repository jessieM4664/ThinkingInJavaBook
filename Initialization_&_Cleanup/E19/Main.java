package E19;

import java.util.Arrays;

public class Main {
    public static void main(String args[]) {
        m("Hi", "Jessie"); // intialized string acceptable
        m();                       // empty string acceptable
    }

    static void m(String... args) { // both strings[] are valid with varargs = "..."
        System.out.println(Arrays.toString(args));
    }
}
