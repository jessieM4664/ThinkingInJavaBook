package E11;

public class Main {
    private Detergent d = new Detergent();
    private String str;
    public Main(String passedStr) {
        this.str = passedStr;
    }
    public static void main(String args[]) {
        Main m = new Main("wash");
        m.scrub();

    }
    //delegate method
    public void scrub() {
        d.scrub(str); 
    }
}

class Detergent {
    public void scrub(String str) {
        System.out.println(str); 
    }
}
