package E20;

import javax.print.attribute.standard.Fidelity;

public class Main {
    public static void main(String args[]) {
        
    }
    void with(final Gizmo g) {
        //! cannot make a new reference to g, i.e. "g = new Gizmo();"
    }

    int g(final int i) {
        return i + 1;
    }
}

class Gizmo {
    public void spin() { }
}

