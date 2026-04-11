package Bitwise;

public class SwapNumbers {

    // Swap two numbers without using a temporary variable (using XOR)
    // Logic:
    //   a = a ^ b  → a now holds combined info of both
    //   b = a ^ b  → b gets original value of a
    //   a = a ^ b  → a gets original value of b
    //
    // Example: a = 5 (101), b = 4 (100)
    //   a = 101 ^ 100 = 001  (a = 1)
    //   b = 001 ^ 100 = 101  (b = 5) ← original a
    //   a = 001 ^ 101 = 100  (a = 4) ← original b

    public static void main(String args[]) {

        int a = 5; // binary: 101
        int b = 4; // binary: 100

        System.out.println("Before swap: a = " + a + ", b = " + b);

        a = a ^ b;
        b = a ^ b;
        a = a ^ b;

        System.out.println("After swap:  a = " + a + ", b = " + b);

        // Another example
        int x = 10;
        int y = 25;

        System.out.println("\nBefore swap: x = " + x + ", y = " + y);

        x = x ^ y;
        y = x ^ y;
        x = x ^ y;

        System.out.println("After swap:  x = " + x + ", y = " + y);
    }
}
