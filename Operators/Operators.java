package Operators;

import java.util.*;

public class Operators {
    public static void main(String[] args) {

        // Arithemetic Operators
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println("Addition : " + (a + b));
        System.out.println("Subtraction : " + (a - b));
        System.out.println("Multiplication : " + (a * b));
        System.out.println("Division : " + (a / b));
        System.out.println("Modulus : (Remainder) " + (a % b));

        // Unary Operators
        int c = 10;
        System.out.println("Pre-increment : " + (++c));
        System.out.println("Post-increment : " + (c++));
        System.out.println("Pre-decrement : " + (--c));
        System.out.println("Post-decrement : " + (c--));

        // Relational Operators
        System.out.println("a == b : " + (a == b));
        System.out.println("a != b : " + (a != b));
        System.out.println("a > b : " + (a > b));
        System.out.println("a < b : " + (a < b));
        System.out.println("a >= b : " + (a >= b));
        System.out.println("a <= b : " + (a <= b));

        // logical operators
        int d = 10;
        int e = 20;
        System.out.println("d && e : " + (d > e && e > d));
        System.out.println("d || e : " + (d > e || e > d));
        System.out.println("!d : " + (!(d > e)));

        // assignment operators
        int f = 10;
        int g = 20;
        System.out.println("f += g : " + (f += g));
        System.out.println("f -= g : " + (f -= g));
        System.out.println("f *= g : " + (f *= g));
        System.out.println("f /= g : " + (f /= g));
        System.out.println("f %= g : " + (f %= g));

    }
}
