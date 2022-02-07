/*
 / Emma // Emma Sanchez
 */
import java.util.Scanner;
public class validdate {
	
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Enter a date in the format month/day/year");
		
		String ogDate = keyboard.nextLine();
		String date = ogDate;
		
		int IndexOfFirstSlash = date.indexOf("/");
		String iMonth = date.substring(0,IndexOfFirstSlash);
		date = date.substring(IndexOfFirstSlash+1);
		IndexOfFirstSlash = date.indexOf("/");
		String iDay = date.substring(0,IndexOfFirstSlash);
		date = date.substring(IndexOfFirstSlash+1);
		String iYear = date;
		/*
		 *  Here I am creating new variables that can be integers from the
		 *  string values.  
		 */
		int month = Integer.parseInt(iMonth);
		int day = Integer.parseInt(iDay);
		int year = Integer.parseInt(iYear);
		
		//im creating a boolean variable to keep track of which 
		boolean isValid = true;
		if(!isValid)
		{
			//if "isValid" turns false then the program will exit
			System.exit(0);
		}
		//if the month is not between 1-12 then we don't need to go any further in the program
		if(month < 1 || month > 12)
		{
			System.out.print(""+ogDate+" is an invalid date! The month is \nwrong for this date. Must be between 1 and 12.");
			isValid = false;
		}
	
		//if the month is 4,6,9, or 11 then the day must be between 1-30
		if(month == 4 || month == 6 || month == 9 || month == 11)
		{
			if(day >= 1 || day <=30)
			{
				isValid = true;
			}
			if (day < 1 || day > 30)
			{
				System.out.println(""+ogDate+" is invalid! The day is wrong for \nthis month. Must be between 1 and 30");
				isValid = false;
			}
		}
		//if the month is 1,3,5,7,8,10, or 12 then the day must be between 1-31
		if(month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12)
		{
			if(day >= 1 || day <= 31)
			{
				isValid = true;
			}
			if(day < 1 || day > 31)
			{
				System.out.println(""+ogDate+" is invalid! The day is wrong for \nthis month. Must be between 1 and 31");
				isValid = false;
			}
		}
		
		//this if statement is specifically for the month of February
		if(month == 2)
		{
			if(day >= 1 || day <= 28)
			{
				isValid = true;
			}
			if(day < 1 || day > 29)
			{
				System.out.println(""+ogDate+" is invalid! The day is wrong for this month. \nMust be between 1 and 29");
				isValid = false;
			}
		}
		if(month == 2 && day == 29)
		{
			if(year%4 == 0)
			{
				isValid = true;
				if(year%100 != 0)
				{
					isValid = true;
				}
				else if(year%100 == 0 && year%400 == 0)
				{
					isValid = true;
				}
				else
				{
					System.out.println(""+ogDate+" is invalid! The date given \nis not a leap year.");
					isValid = false;
				}
			}
		}
		if(isValid)
		{
			System.out.println(""+ogDate+" is a valid date!");
		}
	}
}






