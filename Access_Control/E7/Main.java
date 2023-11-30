package E7;

public class Main {
    public static void main(String args[]) {
        A a = new A("A");
    }
}


class A {
    String stm;
    A(String passedStm) {
        this.stm = passedStm;
        printStm(stm);
    }

    void printStm(String passedStm2) {
        System.out.println(passedStm2);
    }
}