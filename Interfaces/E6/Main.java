package E6;

import java.lang.reflect.*;

// prove that interface methods are implicity public.

interface I {
    void m1();
    void m2();
}

public class Main {
    public static void main(String args[]) {
        Class<I> reflect = I.class;
        Method methods[] = reflect.getDeclaredMethods();

        for (Method m : methods) {
            if (Modifier.isPublic(m.getModifiers())) {
                System.out.println(m.getName() + " is public");
            } else {
                System.out.println(m.getName() + " is not public");
            }
        }
    }
}

/**
 * output: 
 * 
 *  m2 is public
 *  m1 is public
 */
