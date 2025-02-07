import java.util.Vector;

public class VectorDemo {
    public static void main(String[] args) {
        Vector<String> students = new Vector<>();

        students.add("Rahul");
        students.add("Priya");
        students.add("Karan");
        System.out.println("Initial List of Students: " + students);
        printAllElements(students);

        students.remove("Priya");
        System.out.println("\nAfter Removing 'Priya':");
        printAllElements(students);

        students.set(1, "Aman");
        System.out.println("\nAfter Updating 'Karan' to 'Aman':");
        printAllElements(students);

        System.out.println("\nCurrent Capacity: " + students.capacity());

        students.add("Sneha");
        students.add("Rohit");
        students.add("Meera");
        students.add("Akash");
        students.add("Simran");
        students.add("Tanya");
        students.add("Vikas");
        students.add("Nidhi");
        students.add("Arjun");
        students.add("Pooja");

        System.out.println("\nAfter Adding More Students:");
        printAllElements(students);

        System.out.println("\nUpdated Capacity: " + students.capacity());
    }

    public static void printAllElements(Vector<String> vector) {
        for (String student : vector) {
            System.out.print(student + " ");
        }
        System.out.println();
    }
}
