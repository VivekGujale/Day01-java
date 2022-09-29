//Write a program to demonstrate static variables, methods, and blocks.

public class StaticVariable {
    static int x = 10;
    static int y;

    public static void method(int z) {
        System.out.println("value of x = " + x);
        System.out.println("value of y = " + y);
        System.out.println("value of z = " + z);
    }

    static {
        System.out.println("static initialization block.");
        y = x + 5;
    }

    public static void main(String args[]) {

        method(20);
    }
}
