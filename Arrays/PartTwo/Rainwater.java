package Arrays.PartTwo;

public class Rainwater {

    public static int trapwater(int n[]) {
        int x = n.length;
        int leftmax[] = new int[x];
        int rightmax[] = new int[x];

        // Auxiliary Array to calculate leftmax
        leftmax[0] = n[0];
        for (int i = 1; i < x; i++) {
            leftmax[i] = Math.max(n[i], leftmax[i - 1]);
        }

        // Auxiliary Array to calculate rightmax
        rightmax[x - 1] = n[x - 1];
        for (int i = x - 2; i >= 0; i--) {
            rightmax[i] = Math.max(n[i], rightmax[i + 1]);
        }

        // Calculate total water trapped
        int total = 0;
        for (int i = 0; i < x; i++) {
            // Calculate water height for each bar
            int waterHeight = Math.min(leftmax[i], rightmax[i]);
            // Calculate water trapped for each bar
            int water = waterHeight - n[i];
            total += water;
        }

        return total;

    }

    public static void main(String args[]) {
        int height[] = { 4, 2, 0, 6, 3, 2, 5 };
        System.out.print(trapwater(height));
    }
}
