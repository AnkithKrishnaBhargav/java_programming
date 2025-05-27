package D;

import B.b;
import C.c;

public class d {
    public static void main(String[] args) {
        b b = new b();
        c c = new c();

        System.out.println("From B");
        b.display();
        System.out.println("From C");
        c.display();
    }
}
