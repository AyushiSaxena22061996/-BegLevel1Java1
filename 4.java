import java.util.*;
import java.lang.*;
import java.io.*;


class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a character");
		char ch = s.next().charAt(0);
		if((ch>='a' && ch<='z') || (ch>='A' && ch<='Z'))
		{
		System.out.println("Entered character is an alphabet");
		}
		else 
		{
		System.out.println("Entered character is not an alphabet");
		}
	

	}
	
}