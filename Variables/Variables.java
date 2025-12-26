package Variables; // package name is the name of the folder 

import java.util.*;

public class Variables { // class name is the name of the file
    public static void main(String args[]) { // main method is the entry point of the program

        System.out.print("Hello World"); // print statement

        System.out.println("\n");

        // Print pattern
        System.out.println("****");
        System.out.println("***");
        System.out.println("**");
        System.out.println("*");

        System.out.println();

        // Variables in Java
        int a = 10; // declaration and initialization
        int b = 5;

        System.out.println(a); // print value of a
        System.out.println(b); // print value of b

        String name = "NIGHTWOLF"; // declaration and initialization
        System.out.println(name);

        a = 20; // update value of a
        System.out.println(a); // print updated value of a

        System.out.println();

        // Data Types in Java
        byte c = 8; // used to store number between -128 to 127
        System.out.println(c);
        char ch = 'a'; // used to store single character i.e [a-z] or [A-Z] or [0-9] or [symbol]
        System.out.println(ch);
        boolean isTrue = true; // used to store true or false
        System.out.println(isTrue);
        int d = 10; // used to store number between -2^31 to 2^31 - 1
        System.out.println(d);
        long e = 10L; // used to store number between -2^63 to 2^63 - 1
        System.out.println(e);
        float f = 10.5f; // used to store decimal number (approx range of ±3.4E38)
        System.out.println(f);
        double g = 10.5; // used to store decimal number (approx range of ±1.8E308)
        System.out.println(g);
        short h = 10; // used to store number between -32768 to 32767
        System.out.println(h);

        System.out.println();

        // sum of two numbers
        int sum = a + b;
        System.out.println(sum); /*
                                  * In Java, the right-hand side expression is fully evaluated first, and only
                                  * then the result is assigned to the variable on the left-hand side.
                                  */

        System.out.println();

        // Input in Java
        Scanner sc = new Scanner(System.in);
        String input = sc.next(); // reads a string of characters until a whitespace is encountered.
        System.out.println(input);

        sc.nextLine(); // only need this in case of nextLine() to clear buffer as it stores \n in
                       // buffer

        String line = sc.nextLine(); // reads a string of characters with spaces. you can write a paragraph.
        System.out.println(line);

        int num = sc.nextInt(); // reads an integer.
        System.out.println(num);

        boolean isfalse = sc.nextBoolean(); // reads a boolean.
        System.out.println(isfalse);

        long l = sc.nextLong(); // reads a long.
        System.out.println(l);

        short s = sc.nextShort(); // reads a short.
        System.out.println(s);

        // Sum of Two number (Input from User)
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int sum2 = num1 + num2;
        System.out.println(sum2);

        // Product of Two number (Input from User)
        int num3 = sc.nextInt();
        int num4 = sc.nextInt();
        int product = num3 * num4;
        System.out.println(product);

        // Area of Circle (Input from User)
        float radius = sc.nextFloat();
        float area = 3.14f * radius * radius; /*
                                               * By default Java considers decimal values as double, so we need to add
                                               * 'f' at the end to make it float.
                                               */
        System.out.println(area);

    }
}