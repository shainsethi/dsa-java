package Functions.Solutions;

public class SolutionTwo {

    public static boolean isEven(int n) {
        if (n % 2 == 0)
            return true;

        return false;
    }

    public static void main(String args[]) {
        System.out.print(isEven(3));
    }
}
