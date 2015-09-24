import java.util.Scanner;

public class Lunch 
{

	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		
		int hungry;
		int thirsty;
		
		System.out.println("You are hungry and enter the lunch room");
		System.out.println("Get in line");
		System.out.println("Buy lunch");
		
		System.out.println("Are you thirsty? (1 for yes or 0 for no)");
		thirsty=input.nextInt();
		
		if (thirsty==1)
			System.out.println("Buy Coke");
		if(thirsty==0)
			System.out.println("Don't buy Coke");
		
		System.out.println("Eat lunch");
		System.out.println("Return tray");
		System.out.println("Leave");
		
	}
}
