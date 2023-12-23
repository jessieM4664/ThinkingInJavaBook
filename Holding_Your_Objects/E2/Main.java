package E2;

import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String args[]) {
        Set<Integer> c = new HashSet<Integer>();
        c.add(8); // duplicate 8
        for (int i = 0; i < 10; i++) {
            c.add(i);
        }
        System.out.println(c.toString());
    }
}
