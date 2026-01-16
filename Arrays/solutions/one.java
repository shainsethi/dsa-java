package Arrays.Solutions;

public class One {

    public static boolean isDuplicate(int n[]) {
        for (int i = 0; i < n.length; i++) {
            for (int j = i + 1; j < n.length; j++) {
                if (n[i] == n[j]) {
                    return true;
                }
            }
        }
        return false;
    }

    public static void main(String args[]) {
        int num[] = { 1, 2, 3, 4 };
        System.out.println(isDuplicate(num));
    }
}
