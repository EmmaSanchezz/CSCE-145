/*
 * Emma Sanchez
 */
import java.util.Random;
import java.util.Scanner;
public class d6Roll {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		Random r = new Random();
		System.out.println("Enter the number of times a 6-sided die should be rolled");
		
		int userInput = keyboard.nextInt();
		keyboard.nextLine();
		if(userInput < 1)
		{
			System.out.print("You entered an invalid number. Program will be terminated.");
			System.exit(0);
		}
		int ones = 0;
		int twos = 0;
		int threes = 0;
		int fours = 0;
		int fives = 0;
		int sixes = 0;
		
		
		for(int i = 0; i<userInput; i++)
		{
			int num = r.nextInt(6)+1;
			System.out.println(""+num+" was rolled");
			if(num == 1)
			{
				ones++;
			}
			if(num == 2)
			{
				twos++;
			}
			if(num == 3)
			{
				threes++;
			}
			if(num == 4)
			{
				fours++;
			}
			if(num == 5)
			{
				fives++;
			}
			if(num == 6)
			{
				sixes++;
			}
		}
		System.out.println("One: "+ones+" \nTwo: "+twos+" \nThree: "+threes+" \nFour: "+fours+" \nFive: "+fives+" \nSix: "+sixes+"");
		
	}

}
