/*
 * Colton Kohler
 * 2/2/2025
 * M5 Assignment
 *
 * Purpose: This program finds the location of the largest and smallest
 *          elements in a 2D integer and double array.
 */

public class FindLargestSmallest {

    /**
     * Finds the position of the largest value in a 2D double array.
     * @param arr The 2D double array to search.
     * @return An array containing {row, column} of the largest value.
     */
    public static int[] findLargest(double[][] arr) {
        int[] position = {0, 0}; // Stores the location of the largest value
        double largest = arr[0][0];

        // Loop through the array to find the largest element
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                if (arr[row][col] > largest) {
                    largest = arr[row][col];
                    position[0] = row;
                    position[1] = col;
                }
            }
        }
        return position;
    }

    /**
     * Finds the position of the largest value in a 2D integer array.
     * @param arr The 2D integer array to search.
     * @return An array containing {row, column} of the largest value.
     */
    public static int[] findLargest(int[][] arr) {
        int[] position = {0, 0};
        int largest = arr[0][0];

        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                if (arr[row][col] > largest) {
                    largest = arr[row][col];
                    position[0] = row;
                    position[1] = col;
                }
            }
        }
        return position;
    }

    /**
     * Finds the position of the smallest value in a 2D double array.
     * @param arr The 2D double array to search.
     * @return An array containing {row, column} of the smallest value.
     */
    public static int[] findSmallest(double[][] arr) {
        int[] position = {0, 0};
        double smallest = arr[0][0];

        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                if (arr[row][col] < smallest) {
                    smallest = arr[row][col];
                    position[0] = row;
                    position[1] = col;
                }
            }
        }
        return position;
    }

    /**
     * Finds the position of the smallest value in a 2D integer array.
     * @param arr The 2D integer array to search.
     * @return An array containing {row, column} of the smallest value.
     */
    public static int[] findSmallest(int[][] arr) {
        int[] position = {0, 0};
        int smallest = arr[0][0];

        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                if (arr[row][col] < smallest) {
                    smallest = arr[row][col];
                    position[0] = row;
                    position[1] = col;
                }
            }
        }
        return position;
    }

    /**
     * Main method to test the program.
     */
    public static void main(String[] args) {
        int[][] intNumbers = {
                {500, -20, 300},
                {150, 9999, 42},
                {-1000, 75, 600}
        };

        double[][] doubleNumbers = {
                {12.5, 250.8, -90.3},
                {88.1, 50000.5, 3.14},
                {-25000.6, 9.9, 420.7}
        };

        // Find largest and smallest elements in both arrays
        int[] largestInt = findLargest(intNumbers);
        int[] smallestInt = findSmallest(intNumbers);
        int[] largestDouble = findLargest(doubleNumbers);
        int[] smallestDouble = findSmallest(doubleNumbers);

        // Print results
        System.out.println("Largest in int array: (" + largestInt[0] + ", " + largestInt[1] + ")");
        System.out.println("Smallest in int array: (" + smallestInt[0] + ", " + smallestInt[1] + ")");
        System.out.println("Largest in double array: (" + largestDouble[0] + ", " + largestDouble[1] + ")");
        System.out.println("Smallest in double array: (" + smallestDouble[0] + ", " + smallestDouble[1] + ")");
    }
}
