package E2;

import java.util.*;
import E2.Vector; // created class for example

public class Main {
    Vector v = new Vector();
    System.out.println(v);

    //collision happens as the JVM doesnt know
    // which Vector object to use as java.util
    // also has a built in Vector class
}
