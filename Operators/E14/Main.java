package E14;

public class Main {
    public static void main(String args[]) {
        // print the comparison of two strings
        // prints the comparison of two string using equals()

        String a1 = "Hello";
        String a2 = "HellO";

        String b1 = new String("World");
        String b2 = new String("World");

        System.out.println(a1 + " == " + a2 + ": " + (a1==a2)); // strings
        System.out.println(b1 + " == " + b2 + ": " + (b1==b2)); // objects
        System.out.println(b1 + ".equals(" + b2 + ") " + ": " + (b1.equals(b2))); // objects equals()
    }
}
