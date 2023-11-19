package E5;

public class Main {
    public static void main(String args[]) {
        for (int i = 1; i < 8; i++) {
            for (int j = 1; j < 8; j++) {
                String output = (i%2!=0 && i==j) ? " " + i : ""; // all prime numbers 
                System.out.print(output);
            }
        }
    }
}
