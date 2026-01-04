package Arrays.PartOne;

public class Reverse {

    public static void reverse(int arr[]) {
        int first = 0, last = arr.length - 1;

        while (first < last) {
            int temp = arr[first];
            arr[first] = arr[last];
            arr[last] = temp;

            first++;
            last++;
        }
    }

    public static void main(String args[]) {
        int numbers[] = { 2, 4, 6, 8, 10, };
        reverse(numbers);
    }
}
