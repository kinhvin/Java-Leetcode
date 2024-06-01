/* Author: Kevin Truong
 * Date: January 3, 2024
 * Description: Determine the two indices holding values that will add up to the target
 * Leetcode: #2
 */

import java.util.Arrays;

public class TwoSum {

    public static int[] twoSum(int[] nums, int target) {

        // Initialize output var
        int[] output = {};

        // Cycle through the array
        for(int i = 0; i < nums.length; i++) {
            // Cycle through each consecutive index and add
            for(int j = i + 1; j < nums.length; j++) {
                // If a match to the target is found, set current indices as output
                if(nums[i] + nums[j] == target) {
                    output = new int[] {i, j};
                } // end of if
            } // end of nested for
        } // end of for

        // Return the output
        return output;

    } // end of method

    public static void main(String[] args) {
        // Test the method
        int[] nums = {1, 2, 3, 4};
        int target = 3;
        int[] result = twoSum(nums, target);

        // Print the result
        System.out.println(Arrays.toString(result));

    } // End of main
} // End of class