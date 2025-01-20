//Colton Kohler
//M3 Assignment
//1/19/2025
//The purpose of this program is to mirror the example output given in the description of
//the assignment. 
public class PyramidPattern {
    public static void main(String[] args) {
        int rows = 7; // Number of rows in the pyramid

        for (int i = 0; i < rows; i++) {
            // Print spaces before the numbers
            for (int space = rows - i - 1; space > 0; space--) {
                System.out.print("   "); // Three spaces
            }

            // Print the left side of the pyramid
            int value = 1;
            for (int j = 0; j <= i; j++) {
                System.out.print(value + " ");
                value *= 2; // Double the value
            }

            // Print the right side of the pyramid
            value /= 2; // Start halving
            for (int j = 0; j < i; j++) {
                value /= 2; // Halve the value
                System.out.print(value + " ");
            }

            // Add extra spaces after numbers to align the @ symbol
            for (int space = rows - i - 1; space > 0; space--) {
                System.out.print("  "); // Two additional spaces for alignment
            }

            System.out.println("@"); // Print the @ at the end
        }
    }
}
