/*
 * Author: Colton Kohler
 * Date: 1/26/2025
 * M4 Programming Assignment
 * This program demonstrates overloaded methods to calculate and display the average of arrays of different data types.
 */

public class AverageCalculator {

    // Method to calculate the average of a short array
    public static short average(short[] array) {
        int sum = 0;
        for (short num : array) sum += num;
        return (short) (sum / array.length);
    }

    // Method to calculate the average of an int array
    public static int average(int[] array) {
        int sum = 0;
        for (int num : array) sum += num;
        return sum / array.length;
    }

    // Method to calculate the average of a long array
    public static long average(long[] array) {
        long sum = 0;
        for (long num : array) sum += num;
        return sum / array.length;
    }

    // Method to calculate the average of a double array
    public static double average(double[] array) {
        double sum = 0;
        for (double num : array) sum += num;
        return sum / array.length;
    }

    public static void main(String[] args) {
        // Test arrays
        short[] shortArray = {8, 14, 22};
        int[] intArray = {3, 15, 7, 9};
        long[] longArray = {120L, 450L, 305L, 600L};
        double[] doubleArray = {2.3, 4.7, 3.5, 7.1, 5.9};

        // Test and display results
        displayArray("Short Array", shortArray);
        System.out.println("Average: " + average(shortArray) + "\n");

        displayArray("Int Array", intArray);
        System.out.println("Average: " + average(intArray) + "\n");

        displayArray("Long Array", longArray);
        System.out.println("Average: " + average(longArray) + "\n");

        displayArray("Double Array", doubleArray);
        System.out.println("Average: " + average(doubleArray) + "\n");
    }

    // Method to display elements of a short array
    public static void displayArray(String label, short[] array) {
        System.out.print(label + ": ");
        for (short num : array) System.out.print(num + " ");
        System.out.println();
    }

    // Method to display elements of an int array
    public static void displayArray(String label, int[] array) {
        System.out.print(label + ": ");
        for (int num : array) System.out.print(num + " ");
        System.out.println();
    }

    // Method to display elements of a long array
    public static void displayArray(String label, long[] array) {
        System.out.print(label + ": ");
        for (long num : array) System.out.print(num + " ");
        System.out.println();
    }

    // Method to display elements of a double array
    public static void displayArray(String label, double[] array) {
        System.out.print(label + ": ");
        for (double num : array) System.out.print(num + " ");
        System.out.println();
    }
}
