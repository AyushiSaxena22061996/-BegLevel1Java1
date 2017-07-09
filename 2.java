import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter number:");
		int number = s.nextInt();
		if(number%2==0)
		{
			System.out.println("\n It is even");
		}
		else
		{
			System.out.println("\n It is odd");
		}
	}
}