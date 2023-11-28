package E11;  

// finalize(): By default calls and releases object
// A created finalize() method in YOUR program will override the "class Object" finalize method.
// Method is typicaly written as: 
// potected void finalize() { }

public class Main {
    public static void main(String[] args) {
        //Book m = new Book(true);
        //m.checkIn();
        new Book(true);
        System.gc();
    }
}