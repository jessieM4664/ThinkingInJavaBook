package E8;

interface FastFood {
    void print();
}

public class Sandwich implements FastFood {
    public static void main(String arg[]) {
        new Sandwich().print();
    }
    public void print() {System.out.println("Sandwich()");}
}
class PortableLunch extends Lunch {
    public void print() {System.out.println("PortableLunch()");}
}
class Lunch extends Meal {
    public void print() {System.out.println("Lunch()");}
}
class Bread {
    public void print() {System.out.println("Bread()");}
}
class Meal {
    public void print() {System.out.println("Meal()");}
}
class Pickle {
    public void print() {System.out.println("Pickle()");}
}