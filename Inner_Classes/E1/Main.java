package E1;

public class Main {
    public static void main(String args[]) {
        Outer.Inner in = new Outer().inner();
        System.out.println("Inner object: " + in);
    }
}

class Outer {
    class Inner {
        Inner () {
            System.out.println("class Inner constructor");
        }
    }

    public Inner inner() {
        Inner innerObj = new Inner();
        return innerObj;
    }
}
