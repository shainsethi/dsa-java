package Arrays.PartOne;

public class SubArray {
    public static void sub_array(int num[]) {
        for (int i = 0; i < num.length; i++) {
            for (int j = i + 1; j < num.length; j++) {
                for (int k = i; k <= j; k++) {
                    System.out.print(num[k]);
                }
                System.out.println("");
            }
            System.out.println("");
        }
    }

    public static void main(String args[]) {
        int x[] = { 2, 4, 6, 8, 10 };
        sub_array(x);
    }
}
