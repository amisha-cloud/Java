import java.util.*;

public class DiagonalMatrix {
    int matrix[][] = new int[3][3];
    Scanner myScanner;
    int i, j, row, col;

    public void readvalues() {
        myScanner = new Scanner(System.in);
        System.out.println("Enter Values of matrix: ");
        for (i = 0; i < 3; i++) {
            for (j = 0; j < 3; j++) {
                matrix[i][j] = myScanner.nextInt();
            }
        }
    }

    public void row_sum() {
        int rowise;
        int sum3[] = new int[3];
        for (i = 0; i < 3; i++) {
            rowise = 0;
            for (j = 0; j < 3; j++) {
                rowise += matrix[i][j];
            }
            sum3[i] = rowise;
            System.out.println("sum of row " + (i + 1) + ": " + sum3[i]);
        }
    }

    public void diagonal_sum() {
        int sumMainDiagonal = 0;
        int sumSecondaryDiagonal = 0;
        for (i = 0; i < 3; i++) {
            sumMainDiagonal += matrix[i][i];
            sumSecondaryDiagonal += matrix[i][2 - i];
        }
        System.out.println("Sum of main diagonal = " + sumMainDiagonal);
        System.out.println("Sum of secondary diagonal = " + sumSecondaryDiagonal);
    }

    public static void main(String args[]) {
        DiagonalMatrix obj = new DiagonalMatrix();
        obj.readvalues();
        obj.row_sum();
        obj.diagonal_sum();
    }
}
