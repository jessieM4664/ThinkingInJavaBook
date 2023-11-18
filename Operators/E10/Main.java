package E10;

public class Main {
    public static void main(String args[]) {
        int a = 9; // 1001
        int b = 12; // 1100
        int c = a & b;
        int d = a | b;
        int e = a ^ b;
        int f = ~a;

        System.out.println("AND: " + Integer.toBinaryString(c));
        System.out.println("OR: " + Integer.toBinaryString(d));
        System.out.println("XOR: " + Integer.toBinaryString(e));
        System.out.println("NOT: " + Integer.toBinaryString(f));

    }
}
