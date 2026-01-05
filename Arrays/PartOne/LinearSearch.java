package Arrays.PartOne;

public class LinearSearch {

    public static int linearSearch(int arr[], int key) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key) {
                return i;
            }
        }
        return -1;
    }

    public static int stringSearch(String arr[], String key) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key) {
                return i;
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        int numbers[] = { 2, 4, 6, 8, 10, 12, 14, 16, 18, 20 };
        String fruits[] = { "orange", "banana", "mango", "apple", "grapes" };
        String k = "orange";
        int key = 20;

        int index = linearSearch(numbers, key);
        int result = stringSearch(fruits, k);

        if (result == -1) {
            System.out.println("Not found");
        } else
            System.out.println("key is " + result);

        if (index == -1) {
            System.out.println("Not found");
        } else
            System.out.println("key is " + index);
    }
}
