/* Author: Kevin Truong
 * Date: June 9, 2024
 * Description: You are given a large integer represented as an integer array digits,
 * where each digits[i] is the ith digit of the integer.
 * The digits are ordered from most significant to least significant in left-to-right order.
 * The large integer does not contain any leading 0's.
 * Leetcode: #9
 */

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class PlusOne {

    public int[] plusOne(int[] digits) {

        // Instill a for loop in order to account for MULTIPLE 9's
        for (int i = digits.length - 1; i >= 0; i--) {

            // The last digit is not 9
            if (digits[i] < 9) {
                digits[i] += 1; // inc by 1
                return digits;
            } // end of if

            // The last digit is 9
            digits[i] = 0;

        } // end of for

        // The loop exits without returning anything...
        // Thus... the first index has to have been 9
        int[] newDigits = new int[digits.length + 1];
        newDigits[0] = 1;
        return newDigits;

    } // end of method

    public static void main(String[] args) {

        PlusOne solution = new PlusOne();
        int[] test = {9, 9};
        System.out.println(Arrays.toString(solution.plusOne(test)));
    }
} // end of class
