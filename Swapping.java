import java.util.*;

public class Swapping {
    int num1, num2, temp;
    Scanner scn;

    public void read() {
        scn = new Scanner(System.in);
        System.out.println("Enter the first Number");
        num1 = scn.nextInt();
        System.out.println("Enter the Second Number");
        num2 = scn.nextInt();
    }

    void display() {
        System.out.println("NUM1=" + num1 + "\n" + "NUM2=" + num2);
    }

    void swap() {
        temp = num1;
        num1 = num2;
        num2 = temp;
        System.out.println("NUM1=" + num1 + "\n" + "NUM2=" + num2);
    }

    public static void main(String args[]) {
        Swapping sa = new Swapping();
        sa.read();
        System.out.println("Original Value");
        sa.display();
        System.out.println("Swapping Values");
        sa.swap();
    }
}
