package E14;

public class Main {
    static String str1 = "string1";
    static {
        str1 = "string2";
    }

    public static void main(String args[]) {
        System.out.println("str1 = " + str1);
        System.out.println("str2 = " + str2); // str2 cannot be resolved to a variable
    }
}
