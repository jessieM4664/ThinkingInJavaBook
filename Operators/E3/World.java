package E3;

public class World {
    public static void main(String args[]) {
        People p1 = new People();

        p1.quantity = 10.8F;

        System.out.println("p1.quantity: " + p1.quantity);
        f(p1);
        System.out.println("p1.quantity: " + p1.quantity);
    }

    static void f(People p2) {
        p2.quantity = 99.2F;
    }
}