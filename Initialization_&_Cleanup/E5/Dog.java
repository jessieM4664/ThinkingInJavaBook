package E5;

public class Dog {
    public Dog (String speak) {
        bark(speak);
    }

    public Dog() {
        bark();
    }

    void bark(String speak) {
        System.out.println(speak);
    }

    void bark() {
        System.out.println("no bark");
    }
}


