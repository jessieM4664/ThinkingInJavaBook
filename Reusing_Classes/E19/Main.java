package E19;

public class Main {
    static final String STR1 = "static final string";
           final String STR2 = "final string";
    final String STR3;

    public Main() {
        STR3 = "blank final"; // blanks finals MUST be intialized in the constructor
    }
    public static void main(String args[]) {
        System.out.println(STR1);
    //  System.out.println(STR2);//! ERROR: Cannot make a static reference to the non-static field
        System.out.println(new Main().STR3);
    }
}
