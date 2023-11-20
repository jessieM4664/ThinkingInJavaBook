package E7;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        for (int i = 0; i < 100; i++) {
            if (i == 99) break;
            if (i % 9 != 0) continue;
            System.out.print(i + " ");
        }
    }
}