package Arrays.PartOne;

public class BinarySearch {

    public static int bs(int arr[], int key) {
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            int midkey = (start + end) / 2;
            if (key == arr[midkey]) {
                return midkey;
            }

            if (key < arr[midkey]) {
                end = midkey - 1;
            } else {
                start = midkey + 1;
            }
        }

        return -1;
    }

    public static void main(String args[]) {
        int numbers[] = { 2, 4, 6, 8, 10, };
        int key = 10;
        System.out.println(bs(numbers, key));
    }
}
