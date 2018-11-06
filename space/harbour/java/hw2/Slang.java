package space.harbour.java.hw2;
import java.util.Scanner;
import java.io.*;
public class Slang 
{
	public static String getInput()
	{
		System.out.println("Enter the text lol: ");
		Scanner scanner = new Scanner(System.in);
		String inputString = scanner.nextLine();		
		return inputString;
	}
	
	
	public static void fixString(String text)
	{
		

		String[] terms = {"PLZ", "FYI", "GTFO", "ASAP", ":\\)", ":\\(", " ¯\\_(ツ)_/¯" };		
		String[] replaceWith = {"please","for your information","please, leave me alone","as soon as possible","[smiling]","[sad]","[such is life]"};
		
		for(int i = 0; i <=6; i++) 
		{
		    
		    text = text.replaceAll(terms[i],replaceWith[i]);
		    text= text.replaceAll(terms[6], replaceWith[6]);
		}
		System.out.println(text);
		
	}
	
	public static void main(String[] args)
	{
		String text = getInput();
		fixString(text);
	}

}
