package E5;

public class Main {
    public static void main(String args[]) {
        String arr[] = {"howl","yelp","growl"};

        for (int i = 0; i < arr.length; i++) {
            new Dog(arr[i]);
        }
        new Dog();
    }
}
