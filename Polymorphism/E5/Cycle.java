package E5;


public class Cycle {

    static int wheelCount;
    public static void main(String args[]) {
        Unicycle u = new Unicycle();
        Bicycle b = new Bicycle();
        Tricycle t = new Tricycle();

        System.out.println(u.wheel);
        System.out.println(b.wheel);
        System.out.println(t.wheel);
    }
}

class Unicycle extends Cycle {
    int wheel = 1;
}

class Bicycle extends Cycle {
    int wheel = 2;
}

class Tricycle extends Cycle {
    int wheel = 3;
}