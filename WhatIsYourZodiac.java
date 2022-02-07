/*
 * Emma Sanchez
 */
import java.util.Scanner;
public class WhatIsYourZodiac {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		System.out.println("What is your zodiac? Enter your birthday -- Month \nfollowed by Day as numbers.");
		String ogBirthday = keyboard.nextLine();
		//creating a copy of the string to work with 
		String birthday = ogBirthday;
		
		//creating an integer variable to hold the index of the space
		int IndexOfFirstSpace = birthday.indexOf(" ");
		//the string "iMonth" is now assigned to the first number
		String iMonth = birthday.substring(0,IndexOfFirstSpace);
		birthday = birthday.substring(IndexOfFirstSpace+1);
		
		//the string "iDay" is now assigned to the rest of the users input from the end of the space index
		String iDay = birthday;
		
		//changing the original strings "iMonth" and "iDay" to integers
		int month = Integer.parseInt(iMonth);
		int day = Integer.parseInt(iDay);
		
		//if the month is not between 1-12 then we don't need to go any further
		if(month < 1 || month > 12)
		{
			System.out.print("Invalid Month!");
			if(day < 1 || day > 31)
			{
				System.out.print("Invalid Day!");
				//if the day is not between 1-31 then we can stop the program here
			}
		}
		//if the month is 4,6,9, or 11 then the day must be between 1-30
		if(month == 4 || month == 6 || month == 9 || month == 11)
		{
			if(day <= 1 || day >= 30)
			{
				System.out.print("Invalid Day!");
			}
		}
		//if the month is 1,3,5,7,8,10, or 12 then the day must be between 1-31
		else if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12)
		{
			if(day <= 1 || day >= 31)
			{
				System.out.print("Invalid Day!");
			}
		}
		
		//i'm now creating the if statements for each zodiac
		if(month == 3)
		{
			if(day >=1 && day <=20)
			{
				System.out.print("You are a Pisces!");
			}
			else if(day >= 21 && day <=31)
			{
				System.out.print("You are an Aries!");
			}
		}
		if(month == 4)
		{
			if(day >= 1 && day <= 19)
			{
				System.out.print("You are an Aries!");
			}
			else if(day >= 20 && day <= 30)
			{
				System.out.print("You are a Taurus!");
			}
		}
		if(month == 5)
		{
			if(day >= 1 && day <= 20)
			{
				System.out.print("You are a Taurus!");
			}
			else if(day >= 21 && day <= 31)
			{
				System.out.print("You are a Gemini!");
			}
		}
		if(month == 6)
		{
			if(day >= 1 && day <= 20)
			{
				System.out.print("You are a Gemini!");
			}
			else if(day >= 21 && day <= 30)
			{
				System.out.print("You are a Cancer!");
			}
		}
		if(month == 7)
		{
			if(day >= 1 && day <= 22)
			{
				System.out.print("You are a Cancer!");
			}
			else if(day >= 23 && day <= 31)
			{
				System.out.print("You are a Leo!");
			}
		}
		if(month == 8)
		{
			if(day >= 1 && day <= 22)
			{
				System.out.print("You are a Leo!");
			}
			else if(day >= 23 && day <= 31)
			{
				System.out.print("You are a Virgo!");
			}
		}
		if(month == 9)
		{
			if(day >= 1 && day <= 22)
			{
				System.out.print("You are a Virgo!");
			}
			else if(day >= 23 && day <= 30)
			{
				System.out.print("You are a Libra!");
			}
		}
		if(month == 10)
		{
			if(day >= 1 && day <= 22)
			{
				System.out.print("You are a Libra!");
			}
			else if(day >= 23 && day <= 31)
			{
				System.out.print("You are a Scorpio!");
			}
		}
		if(month == 11)
		{
			if(day >= 1 && day <= 21)
			{
				System.out.print("You are a Scorpio!");
			}
			else if(day >= 22 && day <= 30)
			{
				System.out.print("You are a Sagittarius!");
			}
		}
		if(month == 12)
		{
			if(day >= 1 && day <= 21)
			{
				System.out.print("You are a Sagittarius!");
			}
			else if(day >= 22 && day <= 31)
			{
				System.out.print("You are a Capricorn!");
			}
		}
		if(month == 1)
		{
			if(day >= 1 && day <= 19)
			{
				System.out.print("You are a Capricorn!");
			}
			else if(day >= 20 && day <= 31)
			{
				System.out.print("You are an Aquarius!");
			}
		}
		if(month == 2)
		{
			if(day >= 1 && day <= 18)
			{
				System.out.print("You are an Aquarius!");
			}
			else if(day >= 19 && day <= 29)
			{
				System.out.print("You are a Pisces!");
			}
		}
	}

}
