/*
 * Colton Kohler
 * 2/16/2025
 * M9 Assignment
 * Purpose: This program creates an ArrayList of Strings, prints them using a for-each loop,
 *          and allows a user to request an element. It handles out-of-bounds errors using a try/catch block.
 */

import java.util.ArrayList;
import java.util.Scanner;

public class VegetableList {
    public static void main(String[] args) {
        // Create an ArrayList with 10+ vegetables
        ArrayList<String> vegetableNames = new ArrayList<>();
        vegetableNames.add("Carrot");
        vegetableNames.add("Broccoli");
        vegetableNames.add("Spinach");
        vegetableNames.add("Potato");
        vegetableNames.add("Cucumber");
        vegetableNames.add("Lettuce");
        vegetableNames.add("Pepper");
        vegetableNames.add("Tomato");
        vegetableNames.add("Onion");
        vegetableNames.add("Zucchini");

        // Print the list using a for-each loop
        System.out.println("Vegetables in the list:");
        for (String veggie : vegetableNames) {
            System.out.println(veggie);
        }

        // Get user input
        Scanner inputScanner = new Scanner(System.in);
        System.out.print("\nEnter the index (0-9) of the vegetable you want to see again: ");

        // Autoboxing: Convert user input (String) to Integer
        Integer userChoiceIndex = inputScanner.nextInt(); // Autoboxing (int → Integer)

        // Try to display the selected vegetable with exception handling
        try {
            // Auto-Unboxing: Integer to int
            System.out.println("You selected: " + vegetableNames.get(userChoiceIndex)); // Unboxing (Integer → int)
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Exception thrown: Out of Bounds.");
        }

        inputScanner.close(); // Close scanner
    }
}
