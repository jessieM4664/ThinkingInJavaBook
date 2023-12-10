package E3;

public class Square extends Shape {
    @Override
    public void draw() {
        System.out.println("square draw()");
    }
    @Override
    public void erase() {
        System.out.println("square erase()");
    }
    @Override
    public void print() {
        System.out.println("square print()");
    }
}
