package E4;

public class Main extends AboveMain {
    Main() {
        System.out.println("Main class contructor");
    }
    public static void main(String args[]) {
        Main m = new Main();
    }
}

class AboveMain {
    AboveMain() {
        System.out.println("AboveMain constructor");
    }
}
