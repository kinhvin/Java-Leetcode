/* Author: Kevin Truong
 * Date: May 15, 2024
 * Description: Given an integer array nums, return true if any value appears at least twice in the array, and return
 *              false if every element is distinct.
 * Leetcode: #217
 */

import java.util.HashSet;

public class ContainsDuplicate {

    public boolean containsDuplicate(int[] nums) {

        // Create a HashSet that will store the seen #'s
        HashSet<Integer> seenNums = new HashSet<>();

        // Iterate through the nums array
        for (int num : nums) {

            // If a second instance of a seen # is found, return true
            if (seenNums.contains(num)) {
                return true;
            } // end of if
            seenNums.add(num);
        } // end of for

        return false;
    } // end of method

    public static void main(String[] args) {
        ContainsDuplicate test = new ContainsDuplicate();

        int[] arrayNums = new int[] {2,14,18,22,22};
        System.out.println(test.containsDuplicate(arrayNums));
    }
} // end of class
