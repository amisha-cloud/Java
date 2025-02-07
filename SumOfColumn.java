import java.util.Scanner;

public class SumOfColumn {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of rows: ");
        int rows = sc.nextInt();
        System.out.print("Enter the number of columns: ");
        int cols = sc.nextInt();

        int[][] matrix = new int[rows][cols];

        System.out.println("Enter the matrix elements:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        System.out.println("\nSum of each column:");
        for (int j = 0; j < cols; j++) {
            int columnSum = 0;
            for (int i = 0; i < rows; i++) {
                columnSum += matrix[i][j];
            }
            System.out.println("Column " + (j + 1) + ": " + columnSum);
        }
        sc.close();
    }
}
