package E20;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) { // varargs in main method
        System.out.print(Arrays.toString(args));

        // command line argument:
        // javac Main.java
        // java Main.java [anything after is a command argument]
        // Example:
        // java Main.java Hello World]
        // terminal output: [Hello, World]
    }
}
