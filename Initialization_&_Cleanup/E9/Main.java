package E9;

public class Main {

    int number;  //undefined feild variable
    public static void main(String args[]) {
        new Main();
    }

    Main() {
        this(5);
    }

    Main(int num) {
        this.number = num;
        // number is the MAIN OBJECTS variable.
        // num is the passed variable from the this constructor.
        
        System.out.print(num);
    }
}