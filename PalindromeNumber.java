/* Author: Kevin Truong
 * Date: June 8, 2024
 * Description: Given an integer x, return true if x is a palindrome, and false otherwise.
 * Leetcode: #9
 */

public class PalindromeNumber {
    public boolean isPalindrome(int x) {

        // Variables
        int lengthOfX = String.valueOf(x).length() - 1;
        String xAsStr = Integer.toString(x); // Store the arg x as a Str
        String reverseOfX = ""; // Str to store the reverse of arg x

        // Reverse x and store in Str var
        for (int i = lengthOfX; i >= 0; i--) {

            // Concat x starting from the last index
            reverseOfX = reverseOfX.concat(Character.toString(xAsStr.charAt(i)));

        } // end of for

        // Return the result of comparing x with the reverse of itself
        return xAsStr.equals(reverseOfX);

    } // end of method

    public static void main(String[] args) {
        PalindromeNumber test = new PalindromeNumber();
        System.out.println(test.isPalindrome(121));
    }
} // end of class

//        System.out.println(xAsStr);
//        System.out.println(reverseOfX);