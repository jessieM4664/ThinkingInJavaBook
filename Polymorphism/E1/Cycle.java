package E1;


public class Cycle {
    public static void main(String args[]) {
        Unicycle u = new Unicycle();
        Bicycle b = new Bicycle();
        Tricycle t = new Tricycle();

        u.ride();
        b.ride();
        t.ride();
    }
    public void ride() {
        System.out.println("ride()");
    }
}

class Unicycle extends Cycle {
    
}

class Bicycle extends Cycle {

}

class Tricycle extends Cycle {

}