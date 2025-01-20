/*
 * Name: Colton Kohler
 * Date: 1/19/2025
 * Assignment: M2 Programming Assignment
 * Purpose: This program simulates the game "Rock-Paper-Scissors."
 *          The computer randomly chooses Rock, Paper, or Scissors,
 *          and the user picks one too. It determines who wins.
 */

import java.util.Scanner;
import java.util.Random;

public class RockPaperScissors {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // For user input
        Random random = new Random(); // For computer's choice

        // Computer randomly picks 1 (Rock), 2 (Paper), or 3 (Scissors)
        int computerChoice = random.nextInt(3) + 1;

        // Ask the user for their choice
        System.out.println("Enter your choice: 1 for Rock, 2 for Paper, 3 for Scissors.");
        int userChoice = scanner.nextInt();

        // Check if user input is valid
        if (userChoice < 1 || userChoice > 3) {
            System.out.println("Invalid input. Please enter 1, 2, or 3.");
            return; // End the program
        }

        // Display the choices
        String[] options = {"Rock", "Paper", "Scissors"};
        System.out.println("You chose: " + options[userChoice - 1]);
        System.out.println("The computer chose: " + options[computerChoice - 1]);

        // Decide the winner
        if (userChoice == computerChoice) {
            System.out.println("It's a tie!");
        } else if ((userChoice == 1 && computerChoice == 3) || // Rock beats Scissors
                (userChoice == 2 && computerChoice == 1) || // Paper beats Rock
                (userChoice == 3 && computerChoice == 2)) { // Scissors beats Paper
            System.out.println("You win!");
        } else {
            System.out.println("Computer wins!");
        }
    }
}
