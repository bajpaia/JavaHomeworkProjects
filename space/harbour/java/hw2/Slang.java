package space.harbour.java.hw2;

public class Slang 
{
	public static void main(String[] args)
	{
		
	}
	
	public static void fixString(String text)
	{
		

		String[] terms = {"PLZ", "FYI", "GTFO", "ASAP", ":\\)", ":\\(", " ¯\\_(ツ)_/¯" };
		
		String[] replaceWith = {"please","for your information","please, leave me alone","as soon as possible","[smiling]","[sad]","[such is life]"};
		
		for(int i = 0; i <=6; i++) 
		{
		    
		    text = text.replaceAll(terms[i],replaceWith[i]);
		    text= text.replace(terms[6], replaceWith[6]);
		}
		System.out.println(text);
		
	}

}
