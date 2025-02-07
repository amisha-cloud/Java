import java.util.Scanner;

public class Shapes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the radius of the circle: ");
        double radius = scanner.nextDouble();
        double circleArea = Math.PI * radius * radius;
        System.out.println("Area of Circle: " + circleArea);

        System.out.print("Enter the side of the square: ");
        double side = scanner.nextDouble();
        double squareArea = side * side;
        System.out.println("Area of Square: " + squareArea);

        System.out.print("Enter the base of the triangle: ");
        double base = scanner.nextDouble();
        System.out.print("Enter the height of the triangle: ");
        double height = scanner.nextDouble();
        double triangleArea = 0.5 * base * height;
        System.out.println("Area of Triangle: " + triangleArea);
    }
}
