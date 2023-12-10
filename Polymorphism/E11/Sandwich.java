package E11;

public class Sandwich extends PortableLunch {
    Bread b = new Bread();
    Pickle p = new Pickle();
    Sandwich() {System.out.println("Sandwich()");}
    public static void main(String arg[]) {
        new Sandwich();
    }
}
class PortableLunch extends Lunch {
    PortableLunch() {System.out.println("PortableLunch()");}
}
class Lunch extends Meal {
    Lunch() {System.out.println("Lunch()");}
}
class Bread {
    Bread() {System.out.println("Bread()");}
}
class Meal {
    Meal() {System.out.println("Meal()");}
}
class Pickle {
    Pickle() {System.out.println("Pickle()");}
}