/*
 * Emma Sanchez
 */
import java.util.Scanner;
public class TheCoinMachine {

	//creating static variables since the values shouldn't change
	public static final int QUARTERS = 25;
	public static final int DIMES = 10;
	public static final int NICKELS = 5;
	public static final int PENNIES = 1;
	/*
	 * Entry point into the main method
	 */
	public static void main(String[] args) 
	{
		System.out.println("Enter a number 1-99. The machine will determine a combonation of coins.");
		Scanner keyboard = new Scanner(System.in);
		
		 //Here we created the variable "wholeNumber" as the input from the user. 
		int wholeNumber = keyboard.nextInt();
		/*
		 * while using input from the user, we divide the original number and mod it using "%"
		 * to then assign that value to the respective name (quarters, dimes, nickels, pennies.)
		 */
		int ogNumber = wholeNumber;
		/*
		 * By using the same "wholeNumber" we make it so we don't have to create a new variable 
		 * every time we want to use the same wholeNumber and we can still manipulate it. 
		 */
		int quarters = wholeNumber/QUARTERS;
		wholeNumber = wholeNumber%QUARTERS;
		int dimes = wholeNumber/DIMES;
		wholeNumber = wholeNumber%DIMES;
		int nickels = wholeNumber/NICKELS;
		wholeNumber = wholeNumber%NICKELS;
		int pennies = wholeNumber/PENNIES;
		pennies = wholeNumber;
		
		//After, we print out the end result values to the user.
		System.out.println(+ogNumber+" cents in coins: \n"+quarters+" quarters \n"+dimes+" dimes \n"+nickels+" nickels \n"+pennies+" pennies");
	}

}
