/* Author: Kevin Truong
 * Date: June 22, 2024
 * Description: You are given a 2D matrix grid of size m x n. You need to check if each cell grid[i][j] is:
 * Equal to the cell below it, i.e. grid[i][j] == grid[i + 1][j] (if it exists).
 * Different from the cell to its right, i.e. grid[i][j] != grid[i][j + 1] (if it exists).
 * Return true if all the cells satisfy these conditions, otherwise, return false.
 * Leetcode: #3142
 */

import java.util.ArrayList;

public class GridSatisfies {
    public boolean satisfiesConditions(int[][] grid) {

        // Variables
        boolean belowExists;
        boolean rightExists;

        // Step 1: Iterate through the 2D array using for loops
        for (int i = 0; i <= grid.length - 1; i++) { // Elements of the 2D array
            for (int j = 0; j <= grid[i].length - 1; j++) { // Elements of the current array

                // Step 2: Check if there exists a cell below the current cell
                belowExists = grid.length - 1 >= i + 1;

                // Step 3: Check if the cell below is equal (if it exists)
                if (belowExists) {
                    if (grid[i][j] != grid[i + 1][j]) {
                        return false;
                    } // Inner if
                } // Outer if

                // Step 4: Check if there exists a cell to the right of the current cell
                rightExists = grid[i].length - 1 >= j + 1;

                // Step 5: Check if the cell to the right is neq (if it exists)
                if (rightExists) {
                    if (grid[i][j] == grid[i][j + 1]) {
                        return false;
                    } // Inner if
                } // Outer if
            } // Inner for
        } // Outer for

        // If false is not returned at any point above, the result must be true
        return true;
    } // end of method

    public static void main(String[] args) {
        GridSatisfies test = new GridSatisfies();

        int[][] grid = {{1, 1, 1},
                        {1, 1, 1},
                        {0, 0, 0}};

        System.out.println(test.satisfiesConditions(grid));
    } // end of main
} // end of class
