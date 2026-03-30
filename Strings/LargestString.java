package Strings;

public class LargestString {

    public static void main(String args[]) {
        String fruits[] = { "apple", "mango", "orange" };
        String largest = "";

        for (int i = 1; i < fruits.length; i++) {
            if (fruits[i - 1].compareTo(fruits[i]) < 0) {
                largest = fruits[i];
            }
        }

        System.out.print(largest);

        String lg = fruits[0];
        for (int i = 1; i < fruits.length; i++) {
            if (largest.compareTo(fruits[i]) < 0) {
                largest = fruits[i];
            }
        }

        System.out.print(lg);

    }
}
