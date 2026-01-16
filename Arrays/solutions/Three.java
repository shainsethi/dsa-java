package Arrays.Solutions;

public class Three {

    public static int maxProfit(int n[]) {
        int currentprice = Integer.MAX_VALUE;
        int profit = 0;

        for (int i = 0; i < n.length; i++) {
            int sellprice = Math.min(currentprice, n[i]);
        }
    }

    public static void main(String args[]) {
        int num[] = { 7, 1, 5, 3, 6, 4 };
        System.out.print(maxProfit(num));
    }
}
