import java.util.*;
class Person
{
	int age;
	String name;
	void read()
	{
		Scanner s= new Scanner(System.in);
		System.out.println("Enter Name:");  
       		name = s.nextLine();
		System.out.println("Enter Age:");  
       		age= s.nextInt();
	}
	void display()
	{
		System.out.println("Name:"+name);
		System.out.println("Age:"+age);	
	}
}
class Student extends Person
{
	String program,name,sem;
	int age,fees;
	void read()
	{
		Scanner s= new Scanner(System.in);
		System.out.println("Enter Name:");  
       		name = s.nextLine();
		System.out.println("Enter Age:");  
       		age= s.nextInt();
		s.nextLine();
		System.out.println("Enter Semester:");  
       		sem = s.nextLine();
		System.out.println("Enter Program:");  
       		program = s.nextLine();
		System.out.println("Enter Fees:");  
       		fees = s.nextInt();
	}
	void display()
	{
		System.out.println("Name:"+name);
		System.out.println("Age:"+age);
		System.out.println("Semester:"+sem);
		System.out.println("Program:"+program);
		System.out.println("Fees:"+fees);
	}
}
public class InheritanceDemo
{
	public static void main(String[] args) 
	{
		Person p=new Person();
		p.read();
		p.display();
		Student st=new Student();
		st.read();
		st.display();
	}
}
