import java.util.Scanner;

public class MultiDimensionalArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Get user input for rows and columns
        System.out.print("Enter the number of rows: ");
        int rows = scanner.nextInt();

        System.out.print("Enter the number of columns: ");
        int columns = scanner.nextInt();

        //Create a 2D array
        int[][] matrix = new int[rows][columns];

        //Take user input for the 2D array elements
        System.out.println("Enter the elements of the matrix:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print("Element at (" + i + ", " + j + "): ");
                matrix[i][j] = scanner.nextInt();
            }
        }

        //Create a 1D array to store elements of the 2D array
        int[] array = new int[rows * columns];
        int index = 0;

        //Copy elements from the 2D array to the 1D array
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                array[index++] = matrix[i][j];
            }
        }

        //Display the 1D array
        System.out.print("Elements of the 1D array: ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }
}