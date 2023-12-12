package E17;


public class Cycle {
    public static void main(String args[]) {
        Cycle c[] = {new Unicycle(), new Bicycle(), new Tricycle()};

        for (int i : c) {
            c[i].balance();
            // the balance method is not present in class Tricycle
        }
    }
    public void ride() {
        System.out.println("ride()");
    }
}

class Unicycle extends Cycle {
    public void balance() {

    }
}

class Bicycle extends Cycle {
    public void balance() {

    }
}

class Tricycle extends Cycle {

}