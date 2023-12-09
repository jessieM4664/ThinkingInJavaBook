package The_Pattern_Concept.E2;

public class Main {
    public static void main(String args[]) {
        A a1 = A.getInstance1();
        System.out.println(a1);

        A a2 = A.getInstance2();
        System.out.println(a2);

        A a3 = A.getInstance3();
        System.out.println(a3);
        
        System.out.println(a2);
    }
}
