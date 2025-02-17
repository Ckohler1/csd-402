/*
 * Colton Kohler
 * 2/16/2025
 * M8 Assignment
 * Purpose: This program receives an ArrayList of Integers from user input,
 *          determines the maximum value, and displays it. If the list is empty, it returns 0.
 */

import java.util.ArrayList;
import java.util.Scanner;

public class ColtonArrayListTest {
    public static void main(String[] args) {
        // Create an ArrayList to store user input numbers
        ArrayList<Integer> userNumbers = new ArrayList<>();
        Scanner inputScanner = new Scanner(System.in);

        System.out.println("Enter numbers (Enter 0 to stop and include it in the list):");

        // Accept numbers until the user enters 0 (which is also added)
        while (true) {
            int userEntry = inputScanner.nextInt();
            userNumbers.add(userEntry);
            if (userEntry == 0) {
                break;
            }
        }

        // Send the list to findMax() method and display the largest number
        Integer largestValue = findMax(userNumbers);
        System.out.println("The largest number in the list is: " + largestValue);

        inputScanner.close(); // Close scanner
    }

    /**
     * Finds and returns the largest Integer in the ArrayList.
     * If the list is empty, returns 0.
     * @param numberList The ArrayList of Integers.
     * @return The maximum Integer value in the list, or 0 if the list is empty.
     */
    public static Integer findMax(ArrayList<Integer> numberList) {
        if (numberList.isEmpty()) {
            return 0;
        }

        Integer maxNumber = numberList.get(0); // Start with the first element
        for (Integer currentNumber : numberList) {
            if (currentNumber > maxNumber) {
                maxNumber = currentNumber;
            }
        }
        return maxNumber;
    }
}
