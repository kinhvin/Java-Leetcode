/* Author: Kevin Truong
 * Date: June 9, 2024
 * Description: Given a signed 32-bit integer x, return x with its digits reversed.
 * If reversing x causes the value to go outside the signed 32-bit integer range [-231, 231 - 1], then return 0.
 * Leetcode: #7
 */

public class ReverseInteger {
    public int reverse(int x) {

        // Initialize reverse as a long value in case of very large values
        long reverse = 0;

        // Reverse x
        while (x != 0) {
            // Get the remainder of x, or the last digit
            // Multiply reverse by 10 to add a 0 at the end in order to take another digit
            // Add the remainder to that result
            reverse = reverse * 10 + x % 10;

            // Cut off the last digit of x
            x /= 10;

        } // end of while

        // Check that the reversed value is within the signed 32-bit integer range
        if (reverse > Integer.MAX_VALUE || reverse < Integer.MIN_VALUE) {

            // Return 0 if it is outside of it
            return 0;
        } // end of if

        // Return the reversed integer
        return (int) reverse; // Cast from long to int
    } // end of method

    // Main method for testing
    public static void main(String[] args) {

        ReverseInteger solution = new ReverseInteger();
        System.out.println(solution.reverse(1234));
    } // end of main
} // end of class
