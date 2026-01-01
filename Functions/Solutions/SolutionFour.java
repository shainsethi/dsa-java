package Functions.Solutions;

/**
 * Solution for Question 4: Math Class Methods
 * 
 * This program demonstrates the usage of various methods from Java's Math
 * class.
 * 
 * Resource: https://www.javatpoint.com/java-math
 */
public class SolutionFour {

    public static void main(String[] args) {

        // --- a. Math.min() ---
        // Returns the smaller of two values
        System.out.println("=== Math.min() ===");
        System.out.println("min(10, 20) = " + Math.min(10, 20)); // Output: 10
        System.out.println("min(-5, -10) = " + Math.min(-5, -10)); // Output: -10
        System.out.println("min(3.5, 2.8) = " + Math.min(3.5, 2.8)); // Output: 2.8
        System.out.println();

        // --- b. Math.max() ---
        // Returns the larger of two values
        System.out.println("=== Math.max() ===");
        System.out.println("max(10, 20) = " + Math.max(10, 20)); // Output: 20
        System.out.println("max(-5, -10) = " + Math.max(-5, -10)); // Output: -5
        System.out.println("max(3.5, 2.8) = " + Math.max(3.5, 2.8)); // Output: 3.5
        System.out.println();

        // --- c. Math.sqrt() ---
        // Returns the square root of a number
        System.out.println("=== Math.sqrt() ===");
        System.out.println("sqrt(16) = " + Math.sqrt(16)); // Output: 4.0
        System.out.println("sqrt(25) = " + Math.sqrt(25)); // Output: 5.0
        System.out.println("sqrt(2) = " + Math.sqrt(2)); // Output: 1.4142...
        System.out.println();

        // --- d. Math.pow() ---
        // Returns base raised to the power of exponent (base^exponent)
        System.out.println("=== Math.pow() ===");
        System.out.println("pow(2, 3) = " + Math.pow(2, 3)); // Output: 8.0 (2^3)
        System.out.println("pow(5, 2) = " + Math.pow(5, 2)); // Output: 25.0 (5^2)
        System.out.println("pow(10, 0) = " + Math.pow(10, 0)); // Output: 1.0 (any^0 = 1)
        System.out.println();

        // --- e. Math.avg() ---
        // NOTE: There is NO Math.avg() method in Java!
        // To calculate average, you need to do it manually:
        System.out.println("=== Average (Custom - no Math.avg() exists) ===");
        int a = 10, b = 20, c = 30;
        double average = (a + b + c) / 3.0;
        System.out.println("Average of 10, 20, 30 = " + average); // Output: 20.0
        System.out.println();

        // --- f. Math.abs() ---
        // Returns the absolute (positive) value of a number
        System.out.println("=== Math.abs() ===");
        System.out.println("abs(-10) = " + Math.abs(-10)); // Output: 10
        System.out.println("abs(10) = " + Math.abs(10)); // Output: 10
        System.out.println("abs(-3.14) = " + Math.abs(-3.14)); // Output: 3.14
        System.out.println();

        // --- Bonus: Other Useful Math Methods ---
        System.out.println("=== Bonus Math Methods ===");
        System.out.println("ceil(4.3) = " + Math.ceil(4.3)); // Output: 5.0 (rounds up)
        System.out.println("floor(4.7) = " + Math.floor(4.7)); // Output: 4.0 (rounds down)
        System.out.println("round(4.5) = " + Math.round(4.5)); // Output: 5 (rounds to nearest)
        System.out.println("random() = " + Math.random()); // Output: random 0.0 to 1.0
    }
}
