package E10;

public class Main {
    public static void main(String args[]) {
        int a = 9; // 1001
        int b = 12; // 1100
        int c = a & b;

        System.out.println(Integer.toBinaryString(c));

        // output of the compared bits in each index a and b: 1000
    }
}
