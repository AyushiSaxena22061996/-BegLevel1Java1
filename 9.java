import java.util.*;
import java.lang.*;
import java.io.*;


class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		int sum = 0;
		int n;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter number");
		n=s.nextInt();
		for(int i = 1;i <= n;i++)
		{
			sum = sum + i;
		}
		System.out.println("The Sum is" + sum);
	}
}