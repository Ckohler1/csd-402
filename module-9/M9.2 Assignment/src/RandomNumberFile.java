/*
 * Colton Kohler
 * 2/16/2025
 * M9 Assignment
 * Purpose: This program creates a file "data.file" (if it does not exist) and writes
 *          or appends 10 random numbers. It then reads the file and displays the contents.
 */

import java.io.*;
import java.util.Random;
import java.util.Scanner;

public class RandomNumberFile {
    public static void main(String[] args) {
        String outputFile = "data.file"; // File name
        Random randomGenerator = new Random(); // Random number generator

        // Step 1: Write (or append) 10 random numbers to the file
        try (FileWriter fileAppender = new FileWriter(outputFile, true); // true = append mode
             PrintWriter numberWriter = new PrintWriter(fileAppender)) {

            for (int count = 0; count < 10; count++) {
                numberWriter.print(randomGenerator.nextInt(100) + " "); // Write random numbers (0-99)
            }
            numberWriter.println(); // Newline for readability
            System.out.println("10 random numbers added to " + outputFile);

        } catch (IOException writeError) {
            System.out.println("Error writing to file.");
        }

        // Step 2: Read and display the file contents
        System.out.println("\nContents of " + outputFile + ":");
        try (Scanner fileScanner = new Scanner(new File(outputFile))) {
            while (fileScanner.hasNext()) {
                System.out.print(fileScanner.next() + " "); // Read numbers
            }
            System.out.println(); // Newline after reading
        } catch (FileNotFoundException readError) {
            System.out.println("File not found.");
        }
    }
}
