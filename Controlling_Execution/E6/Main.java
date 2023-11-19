package E6;

import java.util.Random;

public class Main {
    public static void main(String args[]) {
        Random rand = new Random();
        int array[] = new int[15];

        for (int i = 0; i < 15; i++) {
            int x = rand.nextInt(10);
            array[i] = x;
        }

        for (int y : array) {
            System.out.print(y + " ");
        }

    }
}
