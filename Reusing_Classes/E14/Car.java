package E14;


public class Car {
    public Engine engine = new Engine();
    public Wheel[] wheel = new Wheel[4];
    public Door left = new Door();
    public Door right = new Door();
    public Car() {
        for (int i = 0; i < 4; i++) {
            wheel[i] = new Wheel();
        }
    }
    public static void main(String args[]) {
        Car car = new Car();
        car.left.window.rollup();
        car.wheel[0].inflate(72);
        car.engine.service(); // added method
    }
}

class Engine {
    public void start() { }
    public void rev() { }
    public void stop() { }
    public void service() { }
}

class Wheel {
    public void inflate(int psi) { }
}

class Window {
    public void rollup() { }
    public void rolldown() { }
}

class Door {
    public Window window = new Window();
    public void open() { }
    public void close() { }
}