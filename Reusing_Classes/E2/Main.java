package E2;

public class Main {
    public static void main(String args[]) {
        new Below().scrub();
        new Below().sterilize(); // calls inherited method in Detergent class
    }
}

class Detergent {
    public void scrub() {
        System.out.println("scrub() in Detergent class");
    }

    public void sterilize() {
        System.out.println("sterilize() in Detergent class");
    }
}

class Below extends Detergent{
    public void scrub() {
        System.out.println("scrub() in Below class");
    }
}
