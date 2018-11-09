package space.harbour.java.hw1;
public class Task1
{
        
    public static int give_me_one() 
    {
        return 1;
    }
    
    public static void Main(String[] args)
    {
        int one = give_me_one();
        int two = one * 2;
        System.out.println(two);
    }
}