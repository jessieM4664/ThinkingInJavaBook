package E4;

public class Main {
    public static void main(String args[]) {
        Shape c = new Circle();
        Shape t = new Triangle();
        Shape s = new Square();
        Shape d = new Diamond();

        c.draw();
        t.draw();
        s.draw();
        d.draw();
    }
}
