package Functions;

public class Prime {

    public static boolean prime(int n) {
        if (n <= 1)
            return false;

        if (n == 2)
            return true;

        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void primeInRange(int n) {
        for (int i = 2; i <= n; i++) {
            if (prime(i))
                System.out.println(i);
        }
    }

    public static void main(String args[]) {
        primeInRange(20);
    }
}
