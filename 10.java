import java.util.*;
import java.lang.*;
import java.io.*;


class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		int Number, Count=0;
		Scanner s = new Scanner(System.in);		
		System.out.println("Enter Number: ");
		Number = s.nextInt();
		
		while(Number > 0)
		{
			Number = Number / 10;
			Count = Count + 1; 
		}
		System.out.println("\n Number of Digits in a Given Number is" + Count);
	}
}