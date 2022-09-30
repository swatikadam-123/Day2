import java.util.Scanner;

public class DisplayUnit
{

	public static void main(String[] args)
	{
		Scanner obj = new Scanner(System.in);
		System.out.println("enter number:");
		int y = obj.nextInt();
		if (y <= 9) 
		{
			System.out.println("unit");
		} 
		else if (y >= 10 && y <= 90) 
		{
			System.out.println("ten");
		}
		
		else if (y >= 100 && y <= 900) 
		{
			System.out.println("hundred");
		} 
		else if (y >= 1000 && y <= 9000)
		{
			System.out.println("thousands");
		} 
		else
		{
			System.out.println("not display unit");
		}
	}

}
