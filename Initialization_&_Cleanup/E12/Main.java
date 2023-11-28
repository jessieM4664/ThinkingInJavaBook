package E12;

public class Main {
    public static void main(String args[]) {
        Tank t = new Tank(true); //emptyPassed
        t.filled();
        new Tank(true);
        System.gc();
    }
}
