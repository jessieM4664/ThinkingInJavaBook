package E6;

public class Dog {
    public Dog (String speak) {
        bark(speak, 10);
        bark(5, speak);
    }

    public Dog() {
        bark();
    }

    void bark(String speak, int num) {
        System.out.println("speak first: " + speak + ", num 2nd: " + num);
    }

    void bark(int num, String speak) {
        System.out.println("num first: " + num + ", speak 2nd: " + speak);
    }

    void bark() {
        System.out.println("no speak");
    }
}


