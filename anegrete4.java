
//Alexis Negrete
//Lab 4
//
import java.util.Scanner;

public class anegrete4
{
	public static void main(String[] args)
	{
		int x = 0;

		System.out.println("Please select an option");
		System.out.println("Option 1");
		System.out.println("Option 2");
		System.out.println("Option 3");
		System.out.println("Option 4");

		Scanner scnr = new Scanner(System.in);
		x = scnr.nextInt();

		if(x == 1)
		{
			System.out.println("You think that Gohan is the Strongest Saiyan");
		}
		else if( x == 2)
		{
			System.out.println("The Lakers acquring Luka is the steal of the Century");
		}
		else if(x == 3)
		{
			System.out.println("The Philadelphia Eagles Will upset the Chiefs in Superbowl 59");
		}
		else if(x == 4)
		{
			System.out.println("The Dodgers will repeat as World Series Champions in 2025");
		}
		else
		{
			System.out.println("Invalid option selected");
		}

	}

}

