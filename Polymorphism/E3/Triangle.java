package E3;

public class Triangle extends Shape {
    @Override
    public void draw() {
        System.out.println("triangle draw()");
    }
    @Override
    public void erase() {
        System.out.println("triangle erase()");
    }
    public void print() {
        System.out.println("triangle print()");
    }
}
