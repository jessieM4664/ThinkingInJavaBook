package E12;

public class Tank {

    boolean empty = false;
    
    public Tank(boolean emptyPassed) {
        empty = emptyPassed;
    }

    void filled() {
        empty = false;
    }

    protected void finalize() {
        if (empty) {
            System.out.println("Error: tank empty");
        }
    }
}
