package E2;

public class Main {
    
    String str1 = "String2";  // feild variable

    public Main () {
        String str2 = "String2"; // constructor variable
    }

    public static void main(String args[]) {
        System.out.println(str1); // Cannot make a static reference to the non-static field
        System.out.println(str2); // str2 cannot be resolved to a variable
    }
}
