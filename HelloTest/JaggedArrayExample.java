import java.util.Scanner;

public class JaggedArrayExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of rows for the jagged array: ");
        int numRows = scanner.nextInt();
        int[][] jaggedArray = new int[numRows][];
        for (int i = 0; i < numRows; i++) {
            System.out.print("Enter the number of columns for row " + (i + 1) + ": ");
            int numCols = scanner.nextInt();
            jaggedArray[i] = new int[numCols];

            System.out.println("Enter " + numCols + " elements for row " + (i + 1) + ": ");
            for (int j = 0; j < numCols; j++) {
                jaggedArray[i][j] = scanner.nextInt();
            }
        }

        System.out.println("Jagged Array:");
        for (int i = 0; i < numRows; i++) {
            for (int j = 0; j < jaggedArray[i].length; j++) {
                System.out.print(jaggedArray[i][j] + " ");
            }
            System.out.println();
        }

        scanner.close();
    }
}
