import java.util.*;
public class StringDemo
{
	public static void main(String args[])
	{
		String s="Amisha";
		String y="Singh";
		System.out.println("Uppercase:"+s.toUpperCase());
		System.out.println("Lowercase:"+y.toLowerCase());
		System.out.println("Length:"+s.length());
		System.out.println("CharAt:"+y.charAt(2));
		System.out.println("StartsWith:"+s.startsWith("A"));
		System.out.println("StartsWith:"+y.startsWith("A"));
		System.out.println("Concatenation:"+s.concat(y));
		System.out.println("SubString:"+y.substring(2, 5));
	}
}
