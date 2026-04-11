package Bitwise;

public class UpperToLowerCase {

    // Convert uppercase letter to lowercase using bitwise OR
    // Logic: ASCII difference between uppercase and lowercase is 32
    //        'A' = 01000001 (65)
    //        'a' = 01100001 (97)
    //        Difference = 00100000 (32) → which is (1 << 5) or simply ' ' (space)
    //
    //        To convert uppercase to lowercase:
    //        char | ' '  →  sets the 5th bit, adding 32
    //
    //        To convert lowercase to uppercase:
    //        char & '_'  →  clears the 5th bit, subtracting 32
    //        '_' = 01011111 (95) which is ~32 in the lower 7 bits

    public static void main(String args[]) {

        // Uppercase to Lowercase
        char upper = 'A';

        // 'A' = 01000001
        // ' ' = 00100000
        // OR  = 01100001 = 'a'

        char lower = (char) (upper | ' ');
        System.out.println(upper + " → " + lower);

        // Lowercase to Uppercase
        char lowerChar = 'a';

        // 'a' = 01100001
        // '_' = 01011111
        // AND = 01000001 = 'A'

        char upperChar = (char) (lowerChar & '_');
        System.out.println(lowerChar + " → " + upperChar);

        // Convert a full word
        String word = "HELLO";
        System.out.print("\nUppercase: " + word + " → Lowercase: ");
        for (int i = 0; i < word.length(); i++) {
            System.out.print((char) (word.charAt(i) | ' '));
        }
        System.out.println();

        String word2 = "world";
        System.out.print("Lowercase: " + word2 + " → Uppercase: ");
        for (int i = 0; i < word2.length(); i++) {
            System.out.print((char) (word2.charAt(i) & '_'));
        }
        System.out.println();
    }
}
