package E7;
import java.util.Random;

public class Main {
    public static void main(String args[]) {
        Random rand = new Random();

        int r = rand.nextInt(2); // 0 or 1 generated

        if (r == 0) {
            System.out.println("Heads");
        } else {
            System.out.println("Tails");
        }
    }
}
