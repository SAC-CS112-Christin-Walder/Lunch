import java.util.Scanner;

public class Lunch 
{

	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		
		int thirsty;
		int breakfast;
		
		System.out.println("You are hungry and enter the lunch room");
		System.out.println("Get in line");
		System.out.println("Buy lunch");
		
		System.out.println("Are you thirsty? (1 for yes, 0 for no)");
			thirsty=input.nextInt();
		
		if (thirsty==1){
			System.out.println("Did you eat breakfast? (1 for yes, 0 for no)");
			breakfast=input.nextInt();
			if (breakfast==1){
				System.out.println("Buy Coke");}
				else { 
					System.out.println("Buy Diet Coke");} }
			else {
				System.out.println("You don't get a drink");}

		
		System.out.println("Eat lunch");
		System.out.println("Return tray");
		System.out.println("Leave");
		
	}
}
