import java.util.Scanner;

public class SquareArea {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the side length of the square: ");
        double side = scanner.nextDouble();
        double area = side * side;
        System.out.println("The area of the square is: " + area);
    }
}
