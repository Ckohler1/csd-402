public class FindLargestSmallest {

    public static int[] findLargest(double[][] arr) {
        int[] position = {0, 0};
        double largest = arr[0][0];

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

        int[] largestInt = findLargest(intNumbers);
        int[] smallestInt = findSmallest(intNumbers);
        int[] largestDouble = findLargest(doubleNumbers);
        int[] smallestDouble = findSmallest(doubleNumbers);

        System.out.println("Largest in int array: (" + largestInt[0] + ", " + largestInt[1] + ")");
        System.out.println("Smallest in int array: (" + smallestInt[0] + ", " + smallestInt[1] + ")");
        System.out.println("Largest in double array: (" + largestDouble[0] + ", " + largestDouble[1] + ")");
        System.out.println("Smallest in double array: (" + smallestDouble[0] + ", " + smallestDouble[1] + ")");
    }
}
