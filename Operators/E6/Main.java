package E6;

public class Main {
    public static void main(String args[]) {

        // .equals() is to compare references

        Dog d1 = new Dog();
        Dog d2 = new Dog();
        Dog d3 = d2; // same reference

        d1.name = "Spot";
        d2.name = "Scruffy";
        d3.name = "Spot";

        System.out.println("d1.equals(d2): " + (d1.equals(d2)));
        System.out.println("d2.equals(d3): " + (d2.equals(d3)));
        System.out.println("d1.equals(d3): " + (d1.equals(d3)));

    }
}
