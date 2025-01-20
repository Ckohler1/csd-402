/*
 * Name: Colton Kohler
 * Date: 1/19/2025
 * Assignment: M2 Programming Assignment
 * Purpose: This program calculates the energy (Q) needed to heat water from
 *          an initial temperature to a final temperature. The formula used is:
 *          Q = waterMass * (finalTemperature - initialTemperature) * 4184.
 */

/*
 * Name: Colton Kohler
 * Date: 1/19/2025
 * Assignment: M2 Programming Assignment
 * Purpose: This program calculates the energy (Q) needed to heat water from
 *          an initial temperature to a final temperature. The formula used is:
 *          Q = waterMass * (finalTemp - startTemp) * 4184.
 */

import java.util.Scanner;

public class HeatWaterCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); // For user input

        // Prompt the user for the weight of the water in kilograms
        System.out.println("Enter the weight of the water in kilograms:");
        double weight = input.nextDouble();

        // Prompt the user for the starting temperature in Celsius
        System.out.println("Enter the starting temperature in Celsius:");
        double startTemp = input.nextDouble();

        // Prompt the user for the ending temperature in Celsius
        System.out.println("Enter the ending temperature in Celsius:");
        double finalTemp = input.nextDouble();

        // Calculate the energy required using the formula
        double energyNeeded = weight * (finalTemp - startTemp) * 4184;

        // Display the result
        System.out.println("The energy needed to heat the water is: " + energyNeeded + " Joules.");
    }
}
