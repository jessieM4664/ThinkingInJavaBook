package E12;

public class Main {
    public static void main(String args[]) {
        int i = 31; // 11111
        System.out.println(Integer.toBinaryString(i));
        i <<= 6;
        System.out.println(Integer.toBinaryString(i));
    }
}
