public class ConstructorExample {
    int a, b;

    public ConstructorExample() {
        System.out.println("Default constructor called");
        a = 5;
        b = 10;
    }

    public ConstructorExample(int x, int y) {
        System.out.println("Parameterized constructor called");
        a = x;
        b = y;
    }

    public ConstructorExample(ConstructorExample dummy) {
        System.out.println("Copy constructor called");
        this.a = dummy.a;
        this.b = dummy.b;
    }

    public void display() {
        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }

    public static void main(String[] args) {
        ConstructorExample obj1 = new ConstructorExample();
        obj1.display();
        System.out.println();

        ConstructorExample obj2 = new ConstructorExample(20, 30);
        obj2.display();
        System.out.println();

        ConstructorExample obj3 = new ConstructorExample(obj2);
        obj3.display();
    }
}
