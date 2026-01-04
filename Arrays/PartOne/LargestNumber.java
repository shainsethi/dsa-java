package Arrays.PartOne;

public class LargestNumber {

    public static int largest(int arr[]) {
        int l = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if (l < arr[i]) {
                l = arr[i];
            }
        }

        return l;
    }

    public static int smallest(int arr[]) {
        int s = Integer.MAX_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if (s > arr[i]) {
                s = arr[i];
            }
        }

        return s;
    }

    public static void main(String args[]) {
        int numbers[] = { 1, 3, 6, 2, 5 };
        System.out.println(largest(numbers));
        System.out.print(smallest(numbers));
    }
}
