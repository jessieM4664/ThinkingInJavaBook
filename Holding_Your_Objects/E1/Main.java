package E1;

import java.util.ArrayList;

public class Main {
    public static void main(String args[]) {
        new Gerbil(3).hop();
    }
}

class Gerbil {
    int gerbilNumber;
    ArrayList<Gerbil> arr = new ArrayList<Gerbil>();
    Gerbil (int passedInt) {
        this.gerbilNumber = passedInt;
        
        for(int i = 0; i < gerbilNumber; i++) {
            arr.add(new Gerbil(i));
        }
    }
    void hop() {
        for(int i = 0; i < gerbilNumber; i++) {
            System.out.println("this is Gerbil(" + arr.get(i) + ") and it is hopping.");
        }
    }
}