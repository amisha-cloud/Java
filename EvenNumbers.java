import java.util.Scanner;

public class EvenNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();

        int[] array = new int[n];

        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            array[i] = sc.nextInt();
        }

        System.out.print("Even numbers in the array are: ");
        for (int i = 0; i < n; i++) {
            if (array[i] % 2 == 0) {
                System.out.print(array[i] + " ");
            }
        }

        sc.close();
    }
}
