package Neetcode;

public class ProblemNine {

    // Approach 1: Build reversed string and compare
    public static boolean isPalindromeApproach1(String st) {
        String s = "";

        // remove non-alphanumeric and lowercase
        for (char c : st.toCharArray()) {
            if (Character.isLetterOrDigit(c)) {
                s += Character.toLowerCase(c);
            }
        }

        char[] arr = s.toCharArray();
        int left = 0;
        int right = arr.length - 1;

        while (left < right) {
            char temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }

        String sr = new String(arr);
        return s.equals(sr);
    }

    // Approach 2: Two pointers (optimal)
    public static boolean isPalindromeApproach2(String s) {
        int left = 0;
        int right = s.length() - 1;

        while (left < right) {
            while (left < right && !Character.isLetterOrDigit(s.charAt(left)))
                left++;

            while (left < right && !Character.isLetterOrDigit(s.charAt(right)))
                right--;

            if (Character.toLowerCase(s.charAt(left)) != Character.toLowerCase(s.charAt(right))) {
                return false;
            }

            left++;
            right--;
        }

        return true;
    }

    public static void main(String[] args) {
        String test = "A man, a plan, a canal: Panama";

        System.out.println("Approach 1: " + isPalindromeApproach1(test));
        System.out.println("Approach 2: " + isPalindromeApproach2(test));
    }
}
