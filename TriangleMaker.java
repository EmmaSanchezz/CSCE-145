/*
 * Emma Sanchez
 */
import java.util.Scanner;
public class TriangleMaker {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Welcome to Triangle Maker! Enter the size of the \ntriangle.");
	
		int size = keyboard.nextInt();
		keyboard.nextLine();
		if(size < 1)
		{
			System.out.println("Invalid!!");
			System.exit(0);
		}
		
		for(int i = 1; i <= size; i++)
		{
			for(int j = 1; j <= i; j++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
		for(int i = size; i >= 0; i--)
		{
			for(int j = i-1; j > 0; j--)
			{
				System.out.print("* ");
			}
			System.out.println();
		}	
		System.out.print("DONE!");
	}
}
