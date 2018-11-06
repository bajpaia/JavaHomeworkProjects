package space.harbour.java.hw2;
import java.util.Scanner;
import java.io.*;
class Pascal
{
	public static int getInput()
	{
		System.out.println("Enter the height of triangle as no of rows: ");
		Scanner scanner = new Scanner(System.in);
		String inputString = scanner.nextLine();
		int num = Integer.parseInt ( inputString );
		return num;
	}

	
	public static void printPascal(int n) 
	{ 
		for (int i = 0; i < n; i++) 
		{ 
			int number = 1;
			System.out.printf("%" + (n - i) * 2 + "s", "");
			
			for (int j = 0; j <= i; j++)
			{
				
				System.out.printf("%4d", number);
				number = number * (i - j) / (j + 1);
				
			} 
			
			System.out.println();
		}
	}
	
	public static void main( String[] args)
	{
		int n= getInput();
		printPascal(n);
		
	}

}


