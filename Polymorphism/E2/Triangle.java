package E2;

public class Triangle extends Shape {
    @Override
    public void draw() {
        System.out.println("triangle draw()");
    }
    @Override
    public void erase() {
        System.out.println("triangle erase()");
    }
}
