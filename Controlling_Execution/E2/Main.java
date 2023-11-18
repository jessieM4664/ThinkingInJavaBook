package E2;

import java.util.Random;

public class Main {
    public static void main(String args[]) {
        Random rand = new Random();
        for (int i = 1; i <= 25; i++) {
            int r1 = rand.nextInt(10)+1;
            int r2 = rand.nextInt(10)+1;
            System.out.print(i + ": ");
            if (r1 > r2) {
                System.out.println(r1 + " is GREATER than " + r2);
            } else if (r1 < r2) {
                System.out.println(r1 + " is LESS than " + r2);
            } else {
                System.out.println(r1 + " is EQUAL to " + r2);
            }
        }
    }
}
