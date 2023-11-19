package E6;

public class Main {
    public static void main(String args[]) {
        System.out.println(test(10, 5));
    }

    static int test(int testval, int target) {
        if (testval > target) {
            return +1;
        } else if (testval < target) {
            return -1;
        } else {
            return 0;
        }
    }
}
