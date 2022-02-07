/*
 * Emma Sanchez
 */
import java.util.Scanner;
public class BinaryChanger {
	public static void main(String[] args) {
		//getting input from the user
		System.out.println("Please enter a 4 digit binary value");
		Scanner keyboard = new Scanner(System.in);

		String str1 = keyboard.nextLine();
		/*here, i am separating the string into different strings labeling
		lowercase "one" for the first 4 digit binary value inputed and then captial 
		"ONE" for the first digit in that value*/
		String oneONE = str1.substring(0,1);
		String oneTWO = str1.substring(1,2);
		String oneTHREE = str1.substring(2,3);
		String oneFOUR = str1.substring(3);
		
		//doing the same with the 2nd value as i did with the first
		System.out.println("Please enter a second 4 digit binary value");
		String str2 = keyboard.nextLine();	
		String twoONE = str2.substring(0,1);
		String twoTWO = str2.substring(1,2);
		String twoTHREE = str2.substring(2,3);
		String twoFOUR = str2.substring(3);
		
		//I can now turn each value into an integer
		int ONE = Integer.parseInt(oneONE);
		int TWO = Integer.parseInt(oneTWO);
		int THREE = Integer.parseInt(oneTHREE);
		int FOUR = Integer.parseInt(oneFOUR);
		int FIVE = Integer.parseInt(twoONE);
		int SIX = Integer.parseInt(twoTWO);
		int SEVEN = Integer.parseInt(twoTHREE);
		int EIGHT = Integer.parseInt(twoFOUR);
		
		//now we can multiply each integer by their corresponding base 2 placement value
		double one = ONE*(Math.pow(2, 3));
		double two = TWO*(Math.pow(2, 2));
		double three = THREE*(Math.pow(2, 1));
		double four = FOUR*(Math.pow(2, 0));
		double five = FIVE*(Math.pow(2, 3));
		double six = SIX*(Math.pow(2, 2));
		double seven = SEVEN*(Math.pow(2, 1));
		double eight = EIGHT*(Math.pow(2, 0));
		System.out.println("The first binary value in decimal form is "+one+", "+two+", "+three+", "+four+"");
		System.out.println("The second binary value in decimal form is "+five+", "+six+", "+seven+", "+eight+"");
		
		//adding all the values together to form one decimal value
		double total = one+two+three+four+five+six+seven+eight;
		
		//printing out the total value
		System.out.print("The result of the addition is "+total+"");
	}
}	