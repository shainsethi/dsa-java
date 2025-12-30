package Functions;

public class Functions {

    public static int product(int a, int b) {
        int result = a * b;
        return result;
    }

    public static int factorial(int a) {
        int fact = 1;
        for (int i = 1; i <= a; i++) {
            fact *= i;
        }
        return fact;
    }

    public static int binomial(int n, int r) {
        int a = factorial(n);
        int b = factorial(r);
        int c = factorial(n - r);
        int result = a / (b * c);
        return result;
    }

    public static void main(String[] args) {
        int r = product(5, 3);
        System.out.println(r);
        System.out.println(factorial(5));
        System.out.print(binomial(5, 2));
    }
}
