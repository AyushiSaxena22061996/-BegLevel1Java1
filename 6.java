import java.util.*;
import java.lang.*;
import java.io.*;


class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		int year;
 
        Scanner in= new Scanner(System.in);
        System.out.println("enter the year");
        year= in.nextInt();
        if (year%4==0)
        {
 
        System.out.println("The year is a leap year");
        }
        else 
        {
        System.out.println("The year is not a leap year");
        }
	}
}