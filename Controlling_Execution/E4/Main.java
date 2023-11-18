package E4;

public class Main {
    public static void main(String args[]) {
        for (int i = 1; i < 8; i++) {
            for (int j = 1; j < 8; j++) {
                if (i%2!=0 && i==j) { // all prime numbers 
                    System.out.println(i + " " + j);
                }
            }
        }
    }
}
