package E2;

public class Circle extends Shape {
    @Override
    public void draw() {
        System.out.println("circle draw()");
    }
    @Override
    public void erase() {
        System.out.println("circle erase()");
    }
}
