{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter number");
		int number = s.nextInt();
		if(number>0)
		{
			System.out.println("\n It is a positive number");
		
		}
		else if (number<0)
		{
			System.out.println("\n It is a negative number");
		}
		else
		{
			System.out.println("\n It is zero");
		}
	}
}