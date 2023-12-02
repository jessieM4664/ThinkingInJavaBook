package E10;

public class Root {
    Root(int x) {
        System.out.println("Root Constructor");
    }
    public static void main(String args[]) {
        new Component1();
        new Component2();
        new Component3();
    }
}

class Stem extends Root {
    Stem() {
        super(5);
        System.out.println("Stem Constructor");
    }
}

class Component1 {
    Component1() {
        System.out.println("Con1 Constructor");
    }
}

class Component2 {
    Component2() {
        System.out.println("Con2 Constructor");
    }
}

class Component3 {
    Component3() {
        System.out.println("Con3 Constructor");
    }
}
