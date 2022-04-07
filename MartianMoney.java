/*
*Martian Money
*
*Conversion of dollars into martian currency
*Minh Nguyen
*9/15/2021
*CMSC 255-001
*/
import java.util.Scanner;


public class MartianMoney {
	public static void main(String[]args){

		Scanner input = new Scanner(System.in);

		/*
		inputs: User inputed number or randomly generated number

		Process: Converts the numbers inputted into martian currency

		Output: displays correct number of martian currency based on number inputed
		*/

		//prompts user for an answer, 1 or 2 for random number or user input number

		System.out.println("Would you like to randomly enter a dollar amount (1) or enter it yourself (2)?");
		int answer = input.nextInt();

		//Start the computing based on answer. this one is randomly generated, answer (1)
		if (answer == 1) {	
			
			//generation of random number
			int min = 80;
			int max = 100000000;
			int randomDollars = (int) Math.floor(Math.random()*(max - min + 1)+ min);
			
			
			System.out.println(randomDollars);
			
			//conversion
			int tintina = randomDollars / 80;
			int sutton = (randomDollars % 80) / 16;
			int knorr = ((randomDollars % 80) % 16) / 8;
			int wernicke = ((randomDollars % 80) % 16) % 8;
			
			// If a value is 0, it doesnt print out that value
					if (tintina == 0) {
					System.out.println(randomDollars + " is " + sutton + " sutton " + knorr + " knorr " + wernicke + " wernicke");
				}
				else if (sutton == 0) {
					System.out.println(randomDollars + " is " + tintina + " tintina " + knorr + " knorr " + wernicke + " wernicke");
				}
				else if (knorr == 0) {
					System.out.println(randomDollars + " is " + tintina + " tintina " + sutton + " sutton " + wernicke + " wernicke");
				}
				else if (wernicke == 0) {
					System.out.println(randomDollars + " is " + tintina + " tintina " + sutton + " sutton " + knorr + " knorr");
				}
			//outputs correct amount of martian currency for random generated number
				else {
				System.out.print(randomDollars + " is " + tintina + " tintina " + sutton + " sutton " + knorr + " knorr " + wernicke + " wernicke");
				}
		}
		// Computing user input number, answer (2)
		else if (answer == 2) {

			System.out.println("Enter a dollar amount between $80 and $10,000,000.");
			int userDollars = input.nextInt();
			
			// checks if the amount of money inputed is correct
				if (userDollars < 80) {
				System.out.println("Incorrect input");
				}
				else if (userDollars > 10000000) {
					System.out.println("Incorrect input");

				}
				else if (userDollars > 80 && userDollars < 10000000) {
			int tintina = userDollars / 80;
			int sutton = (userDollars % 80) / 16;
			int knorr = ((userDollars % 80) % 16) / 8;
			int wernicke = ((userDollars % 80) % 16) % 8;
				if (tintina == 0) {
					System.out.println(userDollars + " is " + sutton + " sutton " + knorr + " knorr " + wernicke + " wernicke");
				}
				else if (sutton == 0) {
					System.out.println(userDollars + " is " + tintina + " tintina " + knorr + " knorr " + wernicke + " wernicke");
				}
				else if (knorr == 0) {
					System.out.println(userDollars + " is " + tintina + " tintina " + sutton + " sutton " + wernicke + " wernicke");
				}
				else if (wernicke == 0) {
					System.out.println(userDollars + " is " + tintina + " tintina " + sutton + " sutton " + knorr + " knorr");
				}
			//outputs correct amount of martian currency for user input number
				else{

				System.out.print(userDollars + " is " +  tintina + " tintina " + sutton + " sutton " + knorr + " knorr " + wernicke + " wernicke");
				}
			}
		}
		// if the user inputs a number other than 1 or 2, then prints incorrect input.
		else {

			System.out.println("Incorrect input");

		}

	}
}

