package Arrays.Solutions;

public class Three {

    public static int maxProfit(int n[]) {
        int buyingprice = Integer.MAX_VALUE;
        int maximumProfit = 0; // store previous value of profit

        for (int i = 0; i < n.length; i++) {
            buyingprice = Math.min(buyingprice, n[i]);
            int profit = n[i] - buyingprice;

            if (maximumProfit < profit) {
                maximumProfit = profit;
            }
        }

        return maximumProfit;
    }

    public static void main(String args[]) {
        int num[] = { 7, 1, 5, 3, 6, 4 };
        System.out.print(maxProfit(num));
    }
}
